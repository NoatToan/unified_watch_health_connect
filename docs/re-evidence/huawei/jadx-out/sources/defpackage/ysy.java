package defpackage;

import android.util.Log;
import com.ultrasoniclibrary.ultrasoundcore.classfun.FreqParam;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes46.dex */
public class ysy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f53819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f53820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f53821c;
    public LinkedList<float[]> d;
    public int e;
    public LinkedList<float[]> f;
    public float[] g;
    public float[] h;
    public LinkedList<float[]> i;
    public FreqParam j;
    public long k;
    public int m;
    public byte[] n;
    public String o;

    public ysy(b bVar) {
        this.n = bVar.m;
        this.m = bVar.l;
        this.o = bVar.k;
        this.g = bVar.h;
        this.f53820b = bVar.d;
        this.h = bVar.f;
        this.f53819a = bVar.f53824c;
        this.k = bVar.o;
        this.f53821c = bVar.f53822a;
        this.e = bVar.f53823b;
        this.j = bVar.j;
        this.f = bVar.g;
        this.d = bVar.e;
        this.i = bVar.i;
    }

    public byte[] f() {
        return this.n;
    }

    public long a() {
        return this.f53819a;
    }

    public long j() {
        return this.k;
    }

    public float d() {
        return this.f53821c;
    }

    public LinkedList<float[]> c() {
        return this.f;
    }

    public LinkedList<float[]> e() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public String toString() {
        return "PositioningInput: mRecordData: , TagState: , Orientation: ";
    }

    public static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f53823b;
        public float[] d;
        public LinkedList<float[]> e;
        public float[] f;
        public LinkedList<float[]> g;
        public float[] h;
        public LinkedList<float[]> i;
        public FreqParam j;
        public String k;
        public byte[] m;
        public int l = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f53824c = 1000000000;
        public long o = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f53822a = -100.0f;

        public ysy d() {
            return new ysy(this);
        }

        public b b(byte[] bArr) {
            this.m = bArr;
            return this;
        }

        public b d(int i) {
            this.l = i;
            return this;
        }

        public b c(String str) {
            this.k = str;
            return this;
        }

        public b e(long j) {
            this.f53824c = j;
            return this;
        }

        public b c(long j) {
            this.o = j;
            return this;
        }

        public b c(float f) {
            this.f53822a = f;
            return this;
        }

        public b d(LinkedList<float[]> linkedList) {
            this.g = ysy.b(linkedList);
            return this;
        }

        public b c(LinkedList<float[]> linkedList) {
            this.e = ysy.b(linkedList);
            return this;
        }

        public b e(LinkedList<float[]> linkedList) {
            this.i = ysy.b(linkedList);
            return this;
        }

        public b e(int i) {
            this.f53823b = i;
            return this;
        }

        public b d(FreqParam freqParam) {
            this.j = freqParam;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> LinkedList<T> b(LinkedList<T> linkedList) {
        LinkedList<T> linkedList2;
        LinkedList<T> linkedList3 = new LinkedList<>();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream.writeObject(linkedList);
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                    try {
                        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                        try {
                            linkedList2 = (LinkedList) objectInputStream.readObject();
                            try {
                                objectInputStream.close();
                                try {
                                    byteArrayInputStream.close();
                                    try {
                                        objectOutputStream.close();
                                        try {
                                            byteArrayOutputStream.close();
                                            return linkedList2;
                                        } catch (IOException e) {
                                            e = e;
                                            Log.e("PositioningInput", "deepCopy error: " + e.getMessage());
                                            return linkedList2;
                                        } catch (ClassNotFoundException e2) {
                                            e = e2;
                                            Log.e("PositioningInput", "deepCopy error: " + e.getMessage());
                                            return linkedList2;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        linkedList3 = linkedList2;
                                        try {
                                            byteArrayOutputStream.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    linkedList3 = linkedList2;
                                    try {
                                        objectOutputStream.close();
                                    } catch (Throwable th4) {
                                        th.addSuppressed(th4);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                linkedList3 = linkedList2;
                                try {
                                    try {
                                        byteArrayInputStream.close();
                                    } catch (Throwable th6) {
                                        th.addSuppressed(th6);
                                    }
                                    throw th;
                                } catch (Throwable th7) {
                                    th = th7;
                                    linkedList2 = linkedList3;
                                    linkedList3 = linkedList2;
                                    objectOutputStream.close();
                                    throw th;
                                }
                            }
                        } catch (Throwable th8) {
                            try {
                                objectInputStream.close();
                            } catch (Throwable th9) {
                                th8.addSuppressed(th9);
                            }
                            throw th8;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                    }
                } catch (Throwable th11) {
                    th = th11;
                }
            } catch (Throwable th12) {
                th = th12;
            }
        } catch (IOException | ClassNotFoundException e3) {
            e = e3;
            linkedList2 = linkedList3;
        }
    }
}
