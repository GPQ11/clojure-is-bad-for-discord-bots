(ns Schauspielerin.core
  (:require [discord.bot :as bot] [discord.http :as http])
  (:gen-class))

(bot/defcommand role
  [client message]
  "Adds a role to the user. (doesnt work currently)"
  (bot/say (http/get-roles client (get-in message :author))))

(bot/defcommand unrole
  [client message]
  "Removes a role from the user."
  (bot/say "https://giphy.com/gifs/9K2nFglCAQClO"))

(defn -main
  "Starts the bot."
  [& args]
  (bot/start))
