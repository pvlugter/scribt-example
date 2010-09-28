Scribt Example
==============

This is an example of using [scribt][scribt] to create a release script.

The release script removes the SNAPSHOT from the version, and then
commits and tags the code with git. A publish script is run that
switches to a publish branch and rebases for a special publish changeset,
runs publish, and then switches back to the master branch. The
version is bumped and the code is committed with the new version.

To run this example, first install [scribt][scribt].

Then clone this repository:

    git clone http://github.com/pvlugter/scribt-example.git
    cd scribt-example

Startup sbt:

    sbt

Run the release script in the sbt shell:

    script release


The scripts used can be found in `project/scripts`.

[scribt]: http://github.com/pvlugter/scribt
