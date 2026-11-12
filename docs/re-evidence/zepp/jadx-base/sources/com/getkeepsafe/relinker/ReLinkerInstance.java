package com.getkeepsafe.relinker;

import android.content.Context;
import android.util.Log;
import com.getkeepsafe.relinker.elf.ElfParser;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class ReLinkerInstance {
    private static final String a = "lib";
    public boolean force;
    public final ReLinker.LibraryInstaller libraryInstaller;
    public final ReLinker.LibraryLoader libraryLoader;
    public final Set<String> loadedLibraries;
    public ReLinker.Logger logger;
    public boolean recursive;

    public class a implements Runnable {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ ReLinker.LoadListener d;

        public a(Context context, String str, String str2, ReLinker.LoadListener loadListener) {
            this.a = context;
            this.b = str;
            this.c = str2;
            this.d = loadListener;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            try {
                ReLinkerInstance.this.b(this.a, this.b, this.c);
                this.d.success();
            } catch (MissingLibraryException e) {
                this.d.failure(e);
            } catch (UnsatisfiedLinkError e2) {
                this.d.failure(e2);
            }
        }
    }

    public class b implements FilenameFilter {
        public final /* synthetic */ String a;

        public b(String str) {
            this.a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith(this.a);
        }
    }

    public ReLinkerInstance() {
        this(new com.getkeepsafe.relinker.a(), new ApkLibraryInstaller());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context, String str, String str2) throws Throwable {
        if (this.loadedLibraries.contains(str) && !this.force) {
            log("%s already loaded previously!", str);
            return;
        }
        try {
            this.libraryLoader.loadLibrary(str);
            this.loadedLibraries.add(str);
            log("%s (%s) was loaded normally!", str, str2);
        } catch (UnsatisfiedLinkError e) {
            log("Loading the library normally failed: %s", Log.getStackTraceString(e));
            log("%s (%s) was not loaded normally, re-linking...", str, str2);
            File workaroundLibFile = getWorkaroundLibFile(context, str, str2);
            if (!workaroundLibFile.exists() || this.force) {
                if (this.force) {
                    log("Forcing a re-link of %s (%s)...", str, str2);
                }
                cleanupOldLibFiles(context, str, str2);
                this.libraryInstaller.installLibrary(context, this.libraryLoader.supportedAbis(), this.libraryLoader.mapLibraryName(str), workaroundLibFile, this);
            }
            try {
                if (this.recursive) {
                    ElfParser elfParser = null;
                    try {
                        ElfParser elfParser2 = new ElfParser(workaroundLibFile);
                        try {
                            List<String> neededDependencies = elfParser2.parseNeededDependencies();
                            elfParser2.close();
                            Iterator<String> it2 = neededDependencies.iterator();
                            while (it2.hasNext()) {
                                loadLibrary(context, this.libraryLoader.unmapLibraryName(it2.next()));
                            }
                        } catch (Throwable th) {
                            th = th;
                            elfParser = elfParser2;
                            elfParser.close();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (IOException unused) {
            }
            this.libraryLoader.loadPath(workaroundLibFile.getAbsolutePath());
            this.loadedLibraries.add(str);
            log("%s (%s) was re-linked!", str, str2);
        }
    }

    public void cleanupOldLibFiles(Context context, String str, String str2) {
        File workaroundLibDir = getWorkaroundLibDir(context);
        File workaroundLibFile = getWorkaroundLibFile(context, str, str2);
        File[] fileArrListFiles = workaroundLibDir.listFiles(new b(this.libraryLoader.mapLibraryName(str)));
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (this.force || !file.getAbsolutePath().equals(workaroundLibFile.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    public ReLinkerInstance force() {
        this.force = true;
        return this;
    }

    public File getWorkaroundLibDir(Context context) {
        return context.getDir(a, 0);
    }

    public File getWorkaroundLibFile(Context context, String str, String str2) {
        String strMapLibraryName = this.libraryLoader.mapLibraryName(str);
        if (com.getkeepsafe.relinker.b.a(str2)) {
            return new File(getWorkaroundLibDir(context), strMapLibraryName);
        }
        return new File(getWorkaroundLibDir(context), strMapLibraryName + "." + str2);
    }

    public void loadLibrary(Context context, String str) {
        loadLibrary(context, str, null, null);
    }

    public ReLinkerInstance log(ReLinker.Logger logger) {
        this.logger = logger;
        return this;
    }

    public ReLinkerInstance recursively() {
        this.recursive = true;
        return this;
    }

    public ReLinkerInstance(ReLinker.LibraryLoader libraryLoader, ReLinker.LibraryInstaller libraryInstaller) {
        this.loadedLibraries = new HashSet();
        if (libraryLoader == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        }
        if (libraryInstaller == null) {
            throw new IllegalArgumentException("Cannot pass null library installer");
        }
        this.libraryLoader = libraryLoader;
        this.libraryInstaller = libraryInstaller;
    }

    public void loadLibrary(Context context, String str, String str2) {
        loadLibrary(context, str, str2, null);
    }

    public void log(String str, Object... objArr) {
        log(String.format(Locale.US, str, objArr));
    }

    public void loadLibrary(Context context, String str, ReLinker.LoadListener loadListener) {
        loadLibrary(context, str, null, loadListener);
    }

    public void log(String str) {
        ReLinker.Logger logger = this.logger;
        if (logger != null) {
            logger.log(str);
        }
    }

    public void loadLibrary(Context context, String str, String str2, ReLinker.LoadListener loadListener) {
        if (context != null) {
            if (!com.getkeepsafe.relinker.b.a(str)) {
                log("Beginning load of %s...", str);
                if (loadListener == null) {
                    b(context, str, str2);
                    return;
                } else {
                    new Thread(new a(context, str, str2, loadListener)).start();
                    return;
                }
            }
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        throw new IllegalArgumentException("Given context is null");
    }
}
