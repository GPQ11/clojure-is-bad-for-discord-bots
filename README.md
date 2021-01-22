# Schauspielerin

A bot that allows users to set their own roles.

## Installation

Download the source code and give the bot your token:

    $ git clone https://github.com/GPQ11/Schauspielerin.git
    $ cd Schauspielerin
    $ mkdir -p data/settings
    $ echo '{"token":"YOURTOKENGOESHERE","prefix":"!","bot-name":"Schauspielerin","extension-folders":[]}' > data/settings/settings.json

## Usage

Just use [Leiningen](https://github.com/technomancy/leiningen):

    $ lein run

## Examples

    !role Rapper
    !unrole Rapper

## License

Copyright © 2021 chrissx Media

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
