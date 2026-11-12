package com.mibi.sdk.common.storage;

import com.mibi.sdk.common.Coder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/* JADX INFO: loaded from: classes5.dex */
public class StorageFile extends File {
    private static HashMap<String, Object> sFileLocks = new HashMap<>();

    public StorageFile(File file, String str) {
        super(file, str);
    }

    public static Object getFileLock(File file) {
        Object obj;
        synchronized (sFileLocks) {
            try {
                String absolutePath = file.getAbsolutePath();
                obj = sFileLocks.get(absolutePath);
                if (obj == null) {
                    obj = new Object();
                    sFileLocks.put(absolutePath, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public void append(String str) {
        FileOutputStream fileOutputStream;
        BufferedOutputStream bufferedOutputStream;
        synchronized (getFileLock(this)) {
            PrintWriter printWriter = null;
            try {
                try {
                    fileOutputStream = new FileOutputStream((File) this, true);
                    try {
                        bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                        try {
                            PrintWriter printWriter2 = new PrintWriter(bufferedOutputStream);
                            try {
                                printWriter2.println(Coder.encodeBase64(str));
                                printWriter2.flush();
                                printWriter2.close();
                                try {
                                    bufferedOutputStream.close();
                                } catch (IOException unused) {
                                }
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused2) {
                                }
                            } catch (Exception unused3) {
                                printWriter = printWriter2;
                                if (printWriter != null) {
                                    printWriter.close();
                                }
                                if (bufferedOutputStream != null) {
                                    try {
                                        bufferedOutputStream.close();
                                    } catch (IOException unused4) {
                                    }
                                }
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException unused5) {
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                printWriter = printWriter2;
                                if (printWriter != null) {
                                    printWriter.close();
                                }
                                if (bufferedOutputStream != null) {
                                    try {
                                        bufferedOutputStream.close();
                                    } catch (IOException unused6) {
                                    }
                                }
                                if (fileOutputStream == null) {
                                    throw th;
                                }
                                try {
                                    fileOutputStream.close();
                                    throw th;
                                } catch (IOException unused7) {
                                    throw th;
                                }
                            }
                        } catch (Exception unused8) {
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Exception unused9) {
                        bufferedOutputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedOutputStream = null;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            } catch (Exception unused10) {
                fileOutputStream = null;
                bufferedOutputStream = null;
            } catch (Throwable th5) {
                th = th5;
                fileOutputStream = null;
                bufferedOutputStream = null;
            }
        }
    }

    @Override // java.io.File
    public boolean delete() {
        boolean zDelete;
        synchronized (getFileLock(this)) {
            zDelete = super.delete();
        }
        return zDelete;
    }

    @Override // java.io.File
    public long lastModified() {
        long jLastModified;
        synchronized (getFileLock(this)) {
            jLastModified = super.lastModified();
        }
        return jLastModified;
    }

    @Override // java.io.File
    public long length() {
        long length;
        synchronized (getFileLock(this)) {
            length = super.length();
        }
        return length;
    }

    public String read() {
        Scanner scanner;
        synchronized (getFileLock(this)) {
            try {
                StringBuilder sb = new StringBuilder();
                Scanner scanner2 = null;
                try {
                    scanner = new Scanner(this);
                    while (scanner.hasNextLine()) {
                        try {
                            sb.append(Coder.decodeBase64(scanner.nextLine()) + "\n");
                        } catch (Exception unused) {
                            if (scanner != null) {
                                scanner.close();
                            }
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            scanner2 = scanner;
                            if (scanner2 != null) {
                                scanner2.close();
                            }
                            throw th;
                        }
                    }
                    scanner.close();
                    return sb.toString();
                } catch (Exception unused2) {
                    scanner = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public ArrayList<String> readAndSplit() {
        Scanner scanner;
        ArrayList<String> arrayList = new ArrayList<>();
        synchronized (getFileLock(this)) {
            Scanner scanner2 = null;
            try {
                try {
                    scanner = new Scanner(this);
                    while (scanner.hasNextLine()) {
                        try {
                            arrayList.add(Coder.decodeBase64(scanner.nextLine()));
                        } catch (Exception unused) {
                            if (scanner != null) {
                                scanner.close();
                            }
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            scanner2 = scanner;
                            if (scanner2 != null) {
                                scanner2.close();
                            }
                            throw th;
                        }
                    }
                    scanner.close();
                    if (arrayList.isEmpty()) {
                        arrayList = null;
                    }
                    return arrayList;
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (Exception unused2) {
                scanner = null;
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public byte[] readBytes() {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        synchronized (getFileLock(this)) {
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(this));
                try {
                    byte[] bArr = new byte[(int) super.length()];
                    bufferedInputStream.read(bArr);
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return bArr;
                } catch (Exception unused) {
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Exception unused2) {
                bufferedInputStream = null;
            } catch (Throwable th3) {
                bufferedInputStream = null;
                th = th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public Serializable readObject() {
        InputStream inputStreamDecodeBase64Stream;
        ObjectInputStream objectInputStream;
        Throwable th;
        FileInputStream fileInputStream;
        synchronized (getFileLock(this)) {
            try {
                try {
                    fileInputStream = new FileInputStream(this);
                    try {
                        inputStreamDecodeBase64Stream = Coder.decodeBase64Stream(fileInputStream);
                        try {
                            objectInputStream = new ObjectInputStream(inputStreamDecodeBase64Stream);
                            try {
                                Serializable serializable = (Serializable) objectInputStream.readObject();
                                try {
                                    objectInputStream.close();
                                } catch (IOException unused) {
                                }
                                if (inputStreamDecodeBase64Stream != null) {
                                    try {
                                        inputStreamDecodeBase64Stream.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                try {
                                    fileInputStream.close();
                                } catch (IOException unused3) {
                                }
                                return serializable;
                            } catch (Exception unused4) {
                                if (objectInputStream != 0) {
                                    try {
                                        objectInputStream.close();
                                    } catch (IOException unused5) {
                                    }
                                }
                                if (inputStreamDecodeBase64Stream != null) {
                                    try {
                                        inputStreamDecodeBase64Stream.close();
                                    } catch (IOException unused6) {
                                    }
                                }
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException unused7) {
                                    }
                                }
                                return null;
                            } catch (Throwable th2) {
                                th = th2;
                                if (objectInputStream != 0) {
                                    try {
                                        objectInputStream.close();
                                    } catch (IOException unused8) {
                                    }
                                }
                                if (inputStreamDecodeBase64Stream != null) {
                                    try {
                                        inputStreamDecodeBase64Stream.close();
                                    } catch (IOException unused9) {
                                    }
                                }
                                if (fileInputStream == null) {
                                    throw th;
                                }
                                try {
                                    fileInputStream.close();
                                    throw th;
                                } catch (IOException unused10) {
                                    throw th;
                                }
                            }
                        } catch (Exception unused11) {
                            objectInputStream = 0;
                        } catch (Throwable th3) {
                            objectInputStream = 0;
                            th = th3;
                        }
                    } catch (Exception unused12) {
                        inputStreamDecodeBase64Stream = null;
                        objectInputStream = inputStreamDecodeBase64Stream;
                        if (objectInputStream != 0) {
                            objectInputStream.close();
                        }
                        if (inputStreamDecodeBase64Stream != null) {
                            inputStreamDecodeBase64Stream.close();
                        }
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        return null;
                    } catch (Throwable th4) {
                        objectInputStream = 0;
                        th = th4;
                        inputStreamDecodeBase64Stream = null;
                    }
                } catch (Throwable th5) {
                    throw th5;
                }
            } catch (Exception unused13) {
                fileInputStream = null;
                inputStreamDecodeBase64Stream = null;
            } catch (Throwable th6) {
                inputStreamDecodeBase64Stream = null;
                objectInputStream = 0;
                th = th6;
                fileInputStream = null;
            }
        }
    }

    public void write(String str) {
        synchronized (getFileLock(this)) {
            PrintWriter printWriter = null;
            try {
                try {
                    PrintWriter printWriter2 = new PrintWriter(this);
                    try {
                        printWriter2.println(Coder.encodeBase64(str));
                        printWriter2.flush();
                        printWriter2.close();
                    } catch (Exception unused) {
                        printWriter = printWriter2;
                        if (printWriter != null) {
                            printWriter.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        printWriter = printWriter2;
                        if (printWriter != null) {
                            printWriter.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (Exception unused2) {
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public void writeBytes(byte[] bArr) {
        synchronized (getFileLock(this)) {
            if (bArr == null) {
                super.delete();
                return;
            }
            BufferedOutputStream bufferedOutputStream = null;
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(this));
                try {
                    bufferedOutputStream2.write(bArr);
                    bufferedOutputStream2.flush();
                    try {
                        bufferedOutputStream2.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } catch (Exception unused) {
                    bufferedOutputStream = bufferedOutputStream2;
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Exception unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public void writeObject(Serializable serializable) {
        FileOutputStream fileOutputStream;
        OutputStream outputStreamEncodeBase64Stream;
        synchronized (getFileLock(this)) {
            ObjectOutputStream objectOutputStream = null;
            try {
                try {
                    fileOutputStream = new FileOutputStream(this);
                    try {
                        outputStreamEncodeBase64Stream = Coder.encodeBase64Stream(fileOutputStream);
                        try {
                            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(outputStreamEncodeBase64Stream);
                            try {
                                objectOutputStream2.writeObject(serializable);
                                try {
                                    objectOutputStream2.close();
                                } catch (IOException unused) {
                                }
                                if (outputStreamEncodeBase64Stream != null) {
                                    try {
                                        outputStreamEncodeBase64Stream.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused3) {
                                }
                            } catch (Exception unused4) {
                                objectOutputStream = objectOutputStream2;
                                if (objectOutputStream != null) {
                                    try {
                                        objectOutputStream.close();
                                    } catch (IOException unused5) {
                                    }
                                }
                                if (outputStreamEncodeBase64Stream != null) {
                                    try {
                                        outputStreamEncodeBase64Stream.close();
                                    } catch (IOException unused6) {
                                    }
                                }
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException unused7) {
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                objectOutputStream = objectOutputStream2;
                                if (objectOutputStream != null) {
                                    try {
                                        objectOutputStream.close();
                                    } catch (IOException unused8) {
                                    }
                                }
                                if (outputStreamEncodeBase64Stream != null) {
                                    try {
                                        outputStreamEncodeBase64Stream.close();
                                    } catch (IOException unused9) {
                                    }
                                }
                                if (fileOutputStream == null) {
                                    throw th;
                                }
                                try {
                                    fileOutputStream.close();
                                    throw th;
                                } catch (IOException unused10) {
                                    throw th;
                                }
                            }
                        } catch (Exception unused11) {
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Exception unused12) {
                        outputStreamEncodeBase64Stream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        outputStreamEncodeBase64Stream = null;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            } catch (Exception unused13) {
                fileOutputStream = null;
                outputStreamEncodeBase64Stream = null;
            } catch (Throwable th5) {
                th = th5;
                fileOutputStream = null;
                outputStreamEncodeBase64Stream = null;
            }
        }
    }

    public StorageFile(String str, String str2) {
        super(str, str2);
    }

    public StorageFile(String str) {
        super(str);
    }
}
