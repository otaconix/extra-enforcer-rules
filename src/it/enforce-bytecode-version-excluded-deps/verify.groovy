File file = new File( basedir, "build.log" );
assert file.exists();

String text = file.getText("utf-8");

assert !text.contains("Found Banned Dependency")

return true;
