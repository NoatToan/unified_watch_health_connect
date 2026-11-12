package org.conscrypt;

import j20.x;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSession;
import org.conscrypt.io.IoUtils;
import vb.h;
import wr.g;

/* JADX INFO: loaded from: classes3.dex */
public final class FileClientSessionCache {
    public static final int MAX_SIZE = 12;
    private static final Logger logger = Logger.getLogger(FileClientSessionCache.class.getName());
    static final Map<File, Impl> caches = new HashMap();

    public static class CacheFile extends File {
        long lastModified;
        final String name;

        public CacheFile(File file, String str) {
            super(file, str);
            this.lastModified = -1L;
            this.name = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.Comparable
        public int compareTo(File file) {
            long jLastModified = lastModified() - file.lastModified();
            if (jLastModified == 0) {
                return super.compareTo(file);
            }
            return jLastModified < 0 ? -1 : 1;
        }

        @Override // java.io.File
        public long lastModified() {
            long j8 = this.lastModified;
            if (j8 != -1) {
                return j8;
            }
            long jLastModified = super.lastModified();
            this.lastModified = jLastModified;
            return jLastModified;
        }
    }

    public static class Impl implements SSLClientSessionCache {
        Map<String, File> accessOrder = newAccessOrder();
        final File directory;
        String[] initialFiles;
        int size;

        public Impl(File file) throws IOException {
            boolean zExists = file.exists();
            if (zExists && !file.isDirectory()) {
                throw new IOException(file + " exists but is not a directory.");
            }
            if (zExists) {
                String[] list = file.list();
                this.initialFiles = list;
                if (list == null) {
                    throw new IOException(file + " exists but cannot list contents.");
                }
                Arrays.sort(list);
                this.size = this.initialFiles.length;
            } else {
                if (!file.mkdirs()) {
                    h.C(g.o("Creation of ", file, " directory failed."));
                    throw null;
                }
                this.size = 0;
            }
            this.directory = file;
        }

        private void delete(File file) {
            if (!file.delete()) {
                IOException iOException = new IOException(g.o("FileClientSessionCache: Failed to delete ", file, "."));
                FileClientSessionCache.logger.log(Level.WARNING, iOException.getMessage(), (Throwable) iOException);
            }
            this.size--;
        }

        private static String fileName(String str, int i14) {
            if (str != null) {
                return h.h(i14, str, ".");
            }
            x.l("host == null");
            return null;
        }

        private void indexFiles() {
            String[] strArr = this.initialFiles;
            if (strArr != null) {
                this.initialFiles = null;
                TreeSet<CacheFile> treeSet = new TreeSet();
                for (String str : strArr) {
                    if (!this.accessOrder.containsKey(str)) {
                        treeSet.add(new CacheFile(this.directory, str));
                    }
                }
                if (treeSet.isEmpty()) {
                    return;
                }
                Map<String, File> mapNewAccessOrder = newAccessOrder();
                for (CacheFile cacheFile : treeSet) {
                    mapNewAccessOrder.put(cacheFile.name, cacheFile);
                }
                mapNewAccessOrder.putAll(this.accessOrder);
                this.accessOrder = mapNewAccessOrder;
            }
        }

        public static void logReadError(String str, File file, Throwable th3) {
            FileClientSessionCache.logger.log(Level.WARNING, "FileClientSessionCache: Error reading session data for " + str + " from " + file + ".", th3);
        }

        public static void logWriteError(String str, File file, Throwable th3) {
            FileClientSessionCache.logger.log(Level.WARNING, "FileClientSessionCache: Error writing session data for " + str + " to " + file + ".", th3);
        }

        private void makeRoom() {
            if (this.size <= 12) {
                return;
            }
            indexFiles();
            int i14 = this.size - 12;
            Iterator<File> it = this.accessOrder.values().iterator();
            do {
                delete(it.next());
                it.remove();
                i14--;
            } while (i14 > 0);
        }

        private static Map<String, File> newAccessOrder() {
            return new LinkedHashMap(12, 0.75f, true);
        }

        @Override // org.conscrypt.SSLClientSessionCache
        public synchronized byte[] getSessionData(String str, int i14) {
            String strFileName = fileName(str, i14);
            File file = this.accessOrder.get(strFileName);
            if (file == null) {
                String[] strArr = this.initialFiles;
                if (strArr == null) {
                    return null;
                }
                if (Arrays.binarySearch(strArr, strFileName) < 0) {
                    return null;
                }
                file = new File(this.directory, strFileName);
                this.accessOrder.put(strFileName, file);
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    try {
                        byte[] bArr = new byte[(int) file.length()];
                        new DataInputStream(fileInputStream).readFully(bArr);
                        IoUtils.closeQuietly(fileInputStream);
                        return bArr;
                    } catch (IOException e4) {
                        logReadError(str, file, e4);
                        IoUtils.closeQuietly(fileInputStream);
                        return null;
                    }
                } catch (Throwable th3) {
                    IoUtils.closeQuietly(fileInputStream);
                    throw th3;
                }
            } catch (FileNotFoundException e14) {
                logReadError(str, file, e14);
                return null;
            }
        }

        @Override // org.conscrypt.SSLClientSessionCache
        public synchronized void putSessionData(SSLSession sSLSession, byte[] bArr) {
            String peerHost = sSLSession.getPeerHost();
            if (bArr == null) {
                throw new NullPointerException("sessionData == null");
            }
            String strFileName = fileName(peerHost, sSLSession.getPeerPort());
            File file = new File(this.directory, strFileName);
            boolean zExists = file.exists();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                if (!zExists) {
                    this.size++;
                    makeRoom();
                }
                try {
                    try {
                        try {
                            fileOutputStream.write(bArr);
                            try {
                                fileOutputStream.close();
                                this.accessOrder.put(strFileName, file);
                            } catch (IOException e4) {
                                logWriteError(peerHost, file, e4);
                                delete(file);
                            }
                        } catch (IOException e14) {
                            logWriteError(peerHost, file, e14);
                            try {
                                try {
                                    fileOutputStream.close();
                                } catch (Throwable th3) {
                                    delete(file);
                                    throw th3;
                                }
                            } catch (IOException e15) {
                                logWriteError(peerHost, file, e15);
                            }
                            delete(file);
                        }
                    } catch (Throwable th4) {
                        try {
                            try {
                                fileOutputStream.close();
                            } finally {
                                delete(file);
                            }
                        } catch (IOException e16) {
                            logWriteError(peerHost, file, e16);
                        }
                        throw th4;
                    }
                } catch (Throwable th5) {
                    delete(file);
                    throw th5;
                }
            } catch (FileNotFoundException e17) {
                logWriteError(peerHost, file, e17);
            }
        }
    }

    private FileClientSessionCache() {
    }

    public static synchronized void reset() {
        caches.clear();
    }

    public static synchronized SSLClientSessionCache usingDirectory(File file) {
        Impl impl;
        Map<File, Impl> map = caches;
        impl = map.get(file);
        if (impl == null) {
            impl = new Impl(file);
            map.put(file, impl);
        }
        return impl;
    }
}
