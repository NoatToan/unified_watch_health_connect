package com.huawei.hms.scankit.p;

import android.graphics.Bitmap;
import android.util.Log;
import com.huawei.hms.feature.DynamicModuleInitializer;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public abstract class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f16221a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f16222b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f16223c = false;
    private static int d;
    private static LinkedList e = new LinkedList();
    private static LinkedList f = new LinkedList();
    private static LinkedList g = new LinkedList();
    private static boolean h;
    private static boolean i;
    private static long j;
    private static boolean k;

    static {
        h = !r3.f16300a || r3.f16302c;
        i = false;
        k = false;
        if (DynamicModuleInitializer.getContext() == null) {
            Log.e("ScankitDecode", "static initializer: context null");
            return;
        }
        Log.i("ScankitDecode", "static initializer: InitModuleBegin");
        y4.c(DynamicModuleInitializer.getContext(), "detect.ms");
        y4.a(DynamicModuleInitializer.getContext(), "angle.ms");
        y4.b(DynamicModuleInitializer.getContext(), "corner.ms");
        Log.i("ScankitDecode", "static initializer: InitModuleEnd");
    }

    public static s6[] b(byte[] bArr, x6 x6Var) {
        o4.b("scankit mul", "start decodeMultiCode");
        s6[] s6VarArr = new s6[0];
        try {
            s6[] s6VarArrA = a(bArr, x6Var, false);
            if (r3.g && s6VarArrA.length > 0 && s6VarArrA[0].p()) {
                return s6VarArrA;
            }
            int length = s6VarArrA.length;
            int[] iArr = new int[length];
            int i2 = 0;
            int i3 = 0;
            while (i2 < s6VarArrA.length) {
                int i4 = i2 + 1;
                for (int i5 = i4; i5 < s6VarArrA.length; i5++) {
                    if (v7.a(s6VarArrA[i2].j(), s6VarArrA[i5].j()) > 0.7d) {
                        iArr[i5] = 1;
                        i3++;
                    }
                }
                i2 = i4;
            }
            int length2 = s6VarArrA.length - i3;
            s6VarArr = new s6[length2];
            for (int i6 = 0; i6 < length2; i6++) {
                int i7 = i6;
                while (i7 < length && iArr[i7] == 1) {
                    i7++;
                }
                s6VarArr[i6] = s6VarArrA[i7];
            }
        } catch (IllegalArgumentException unused) {
            o4.b(TrackConstants$Events.EXCEPTION, "IllegalArgumentException");
        } catch (Exception unused2) {
            o4.b(TrackConstants$Events.EXCEPTION, "Exception");
        } catch (OutOfMemoryError unused3) {
            o4.b(TrackConstants$Events.EXCEPTION, "OutOfMemoryError");
        } catch (UnsatisfiedLinkError unused4) {
            o4.b(TrackConstants$Events.EXCEPTION, "UnsatisfiedLinkError");
        } catch (UnsupportedOperationException unused5) {
            o4.b(TrackConstants$Events.EXCEPTION, "UnsupportedArgumentException");
        }
        o4.b("scankit mul", "end decodeMultiCode");
        return s6VarArr;
    }

    public static s6[] c(byte[] bArr, x6 x6Var) {
        s6[] s6VarArr = new s6[0];
        try {
            return a(bArr, x6Var, true);
        } catch (IllegalArgumentException unused) {
            o4.b(TrackConstants$Events.EXCEPTION, "IllegalArgumentException");
            return s6VarArr;
        } catch (Exception unused2) {
            o4.b(TrackConstants$Events.EXCEPTION, "Exception");
            return s6VarArr;
        } catch (OutOfMemoryError unused3) {
            o4.b(TrackConstants$Events.EXCEPTION, "OutOfMemoryError");
            return s6VarArr;
        } catch (UnsatisfiedLinkError unused4) {
            o4.b(TrackConstants$Events.EXCEPTION, "UnsatisfiedLinkError");
            return s6VarArr;
        } catch (UnsupportedOperationException unused5) {
            o4.b(TrackConstants$Events.EXCEPTION, "UnsupportedArgumentException");
            return s6VarArr;
        }
    }

    public static s6[] b(Bitmap bitmap, x6 x6Var) {
        byte[] bArrB = null;
        try {
            x6Var.f16419a = bitmap.getWidth();
            x6Var.f16420b = bitmap.getHeight();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getByteCount());
            bitmap.copyPixelsToBuffer(byteBufferAllocate);
            byteBufferAllocate.flip();
            bArrB = new m6(x6Var.f16419a, x6Var.f16420b, byteBufferAllocate).b();
            byteBufferAllocate.clear();
        } catch (IllegalArgumentException unused) {
            o4.b(TrackConstants$Events.EXCEPTION, "IllegalArgumentException");
        } catch (UnsupportedOperationException unused2) {
            o4.b(TrackConstants$Events.EXCEPTION, "UnsupportedArgumentException");
        } catch (Exception unused3) {
            o4.b(TrackConstants$Events.EXCEPTION, "Exception");
        } catch (OutOfMemoryError unused4) {
            o4.b(TrackConstants$Events.EXCEPTION, "OutOfMemoryError");
        } catch (UnsatisfiedLinkError unused5) {
            o4.b(TrackConstants$Events.EXCEPTION, "UnsatisfiedLinkError");
        }
        return c(bArrB, x6Var);
    }

    private static p4 a(byte[] bArr, x6 x6Var) {
        int i2 = x6Var.f16419a;
        int i3 = x6Var.f16420b;
        if (x6Var.d) {
            int i4 = i2 * i3;
            byte[] bArr2 = new byte[i4];
            float f2 = 0.0f;
            for (int i5 = 0; i5 < i3; i5++) {
                for (int i6 = 0; i6 < i2; i6++) {
                    byte b2 = bArr[(i5 * i2) + i6];
                    f2 += b2 & 255;
                    bArr2[(((i6 * i3) + i3) - i5) - 1] = b2;
                }
            }
            float f3 = f2 / i4;
            if (f3 < 25.0f) {
                r3.e = true;
            } else if (f3 > 215.0f) {
                r3.d = true;
            }
            x6Var.f16419a = i3;
            x6Var.f16420b = i2;
            return new e6(bArr2, i3, i2, 0, 0, i3, i2, false);
        }
        return new e6(bArr, i2, i3, 0, 0, i2, i3, false);
    }

    public static s6 b(List list, o1 o1Var, List list2) {
        List list3;
        boolean z = false;
        List list4 = (List) list2.get(0);
        List list5 = (List) list2.get(1);
        List list6 = (List) list2.get(2);
        List list7 = (List) list2.get(3);
        List list8 = (List) list2.get(4);
        List list9 = (List) list2.get(5);
        List list10 = (List) list2.get(6);
        int i2 = 0;
        s6 s6VarC = null;
        while (i2 < list.size()) {
            if (i2 > 0) {
                o1Var.i.a();
            }
            j2 j2Var = (j2) list.get(i2);
            boolean z2 = j2Var.g() == 5.0f ? true : z;
            boolean z3 = j2Var.g() == 1.0f ? true : z;
            boolean z4 = j2Var.g() == 2.0f ? true : z;
            boolean z5 = j2Var.g() == 3.0f ? true : z;
            boolean z6 = j2Var.g() == 4.0f ? true : z;
            boolean z7 = j2Var.g() == 6.0f ? true : z;
            boolean z8 = j2Var.g() == 7.0f ? true : z;
            if (r3.f16301b) {
                z2 = j2Var.g() == 1.0f ? true : z;
                z3 = j2Var.g() == 2.0f ? true : z;
                z4 = j2Var.g() == 2.0f ? true : z;
                z5 = j2Var.g() == 2.0f ? true : z;
                z6 = j2Var.g() == 1.0f ? true : z;
            }
            o1Var.b(j2Var);
            if (a(s6VarC) && list4.size() > 0 && z3) {
                f16222b = true;
                s6VarC = o1Var.e(list4, j2Var);
            }
            if (a(s6VarC) && list7.size() > 0 && z5) {
                s6VarC = o1Var.b(list7, j2Var);
            }
            if (a(s6VarC) && list8.size() > 0 && z4) {
                s6VarC = o1Var.b(list8, j2Var);
            }
            if (a(s6VarC) && list6.size() > 0 && z6) {
                s6VarC = o1Var.d(list6, j2Var);
            }
            if (a(s6VarC) && list5.size() > 0 && z2) {
                s6VarC = o1Var.a(list5, j2Var);
            }
            if (a(s6VarC) && list9.size() > 0 && z8) {
                s6VarC = o1Var.c(list9, j2Var);
            }
            if (a(s6VarC) && list10.size() > 0 && z7) {
                list3 = list4;
                if (j2Var.h() > 0.6d || r3.f16302c) {
                    s6 s6VarH = o1Var.h(list10, j2Var);
                    s6VarC = (s6VarH == null || o1.b(o1Var.a(), j2Var)) ? s6VarH : null;
                }
            } else {
                list3 = list4;
            }
            if (s6VarC != null && s6VarC.k() != null) {
                return s6VarC;
            }
            i2++;
            list4 = list3;
            z = false;
        }
        return s6VarC;
    }

    public static s6[] b(p4 p4Var, x6 x6Var) {
        s6 s6VarA;
        float fMax;
        s6 s6Var;
        boolean z;
        boolean zA;
        int i2;
        o4.d("ScankitDecode", "scankit mode:FULLSDK21300303 VERSION_NAME: 2.13.0.303");
        r3.a(x6Var);
        List arrayList = new ArrayList();
        if (x6Var.f16419a >= 30 && x6Var.f16420b >= 30 && p4Var != null) {
            List listA = n3.a(x6Var.f16421c);
            List list = (List) listA.get(0);
            List list2 = (List) listA.get(1);
            List list3 = (List) listA.get(2);
            List list4 = (List) listA.get(3);
            List list5 = (List) listA.get(4);
            o1 o1Var = new o1(p4Var);
            o4.d("Scankit", "Start decoding the full image");
            s6 s6Var2 = null;
            if (!f16221a || f16223c) {
                s6VarA = null;
            } else {
                s6VarA = a(list, o1Var);
                i = false;
                j = System.currentTimeMillis();
            }
            if (a(s6VarA)) {
                o4.d("Scankit", "detection start.");
                arrayList = o1Var.a(0, r3.q);
                o4.d("Scankit", "detection results size: " + arrayList.size());
                if (arrayList.size() > 0) {
                    o4.d("Scankit", "Start decoding  with detection");
                    s6VarA = b(arrayList, o1Var, listA);
                    i = true;
                } else {
                    o4.d("Scankit", "Start decoding  without detection");
                    if (r3.f16302c || !r3.f16300a || r3.f16301b) {
                        if (a(s6VarA) && list3.size() > 0) {
                            s6VarA = o1Var.d(list3, null);
                        }
                        if (a(s6VarA) && list2.size() > 0 && h) {
                            s6VarA = o1Var.a(list2, (j2) null);
                        }
                        if (a(s6VarA) && list5.size() > 0) {
                            s6VarA = o1Var.b(list5, (j2) null);
                        }
                        if (a(s6VarA) && list4.size() > 0) {
                            s6VarA = o1Var.b(list4, (j2) null);
                        }
                    }
                }
            }
            o4.d("Scankit", "Decoding completed");
            boolean z2 = (f16221a || !f16222b || f16223c) ? false : true;
            if (x6Var.e && a(s6VarA) && z2) {
                s6VarA = a(list, o1Var);
                f16222b = false;
            }
            if (r3.f16302c) {
                fMax = 1.0f;
                s6Var = null;
                z = false;
                zA = false;
            } else {
                boolean zB = o1Var.b();
                int i3 = r3.k - 1;
                if (i3 <= 0) {
                    i3 = 0;
                }
                r3.k = i3;
                if (arrayList.size() > 0) {
                    zB = zB || o1Var.b(arrayList);
                }
                if (zB && o1Var.c(o1Var.a()) < 20.0f) {
                    zB = false;
                }
                if (o1Var.e() > 0.0f) {
                    fMax = Math.max(1.0f, o1Var.e());
                } else {
                    fMax = Math.max(1.0f, Math.max(o1Var.c(), o1Var.d()));
                }
                s6 s6VarA2 = o1.a(arrayList, o1Var);
                s6 s6VarA3 = o1.a(o1Var);
                zA = arrayList.size() > 0 ? o1.a(arrayList, zB) : false;
                z = zB;
                s6Var = s6VarA2;
                s6Var2 = s6VarA3;
            }
            if (s6Var2 != null && s6Var2.h() == -2) {
                d++;
                i2 = 0;
            } else {
                i2 = 0;
                d = 0;
            }
            o4.d("Scankit", "end zoom and expose cal");
            if (s6VarA != null && s6VarA.k() != null) {
                o4.d("ScankitDecode", "ScanCode successful");
                d = i2;
                s6VarA.b(j);
                s6VarA.a(System.currentTimeMillis());
                s6VarA.a(i);
                return new s6[]{s6VarA};
            }
            if (z) {
                o4.d("ScankitDecode", "ScanCode need zoom");
                s6 s6Var3 = new s6(fMax);
                s6Var3.c(true);
                d = 0;
                return new s6[]{s6Var3};
            }
            if (arrayList.size() > 0 && s6Var != null) {
                o4.d("ScankitDecode", "ScanCode need exposure");
                d = 0;
                return new s6[]{s6Var};
            }
            if (s6Var2 != null && d == 3) {
                s6Var2.b(true);
                s6Var2.a(-1);
                o4.d("ScankitDecode", "ScanCode need globalexposure");
                d = 0;
                return new s6[]{s6Var2};
            }
            if (zA) {
                s6 s6Var4 = new s6(1.0f, true);
                float[] fArr = r3.y;
                float f2 = fArr[0];
                float f3 = fArr[1];
                s6Var4.a(new j2(false, f2, f3, fArr[2] - f2, fArr[3] - f3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f));
                return new s6[]{s6Var4};
            }
            o4.d("ScankitDecode", "ScanCode null");
            return new s6[0];
        }
        throw new IllegalArgumentException("widthOrHeight is Illeagle");
    }

    private static void a(List list, x6 x6Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j2 j2Var = (j2) it.next();
            if (j2Var.d() < x6Var.f16419a * 0.1f) {
                f.offer(new c6(j2Var, x6Var.h));
            } else {
                float fD = j2Var.d();
                float f2 = j2Var.f();
                int i2 = x6Var.f16419a;
                if (fD + f2 > i2 * 0.9f) {
                    f.offer(new c6(j2Var, x6Var.h + i2));
                }
            }
            if (j2Var.e() < x6Var.f16420b * 0.1f) {
                g.offer(new c6(j2Var, x6Var.i));
            } else {
                float fE = j2Var.e();
                float fC = j2Var.c();
                int i3 = x6Var.f16420b;
                if (fE + fC > i3 * 0.9f) {
                    g.offer(new c6(j2Var, x6Var.i + i3));
                }
            }
        }
    }

    public static s6[] a(byte[] bArr, x6 x6Var, boolean z) {
        int i2;
        int i3;
        o4.d("scankit mul", "start pre");
        LinkedList linkedList = new LinkedList();
        a();
        int iMin = Math.min(x6Var.f16419a, x6Var.f16420b);
        float f2 = iMin;
        float fMax = Math.max(x6Var.f16419a, x6Var.f16420b) / f2;
        int i4 = (int) (f2 * 1.78f);
        p4 p4VarA = a(bArr, x6Var);
        o4.d("Scankit", "init " + k);
        if ((r3.d || r3.e) && k) {
            return new s6[0];
        }
        k = true;
        x6 x6Var2 = new x6(x6Var);
        o4.d("scankit mul", "end pre");
        if (iMin > 500 && x6Var.f16419a >= x6Var.f16420b && x6Var.e && fMax > 3.0f) {
            f16223c = true;
            x6Var2.f16419a = i4;
            int i5 = x6Var.f16419a - 1;
            while (i5 >= 0) {
                i5 -= i4;
                int i6 = i5 >= 0 ? i5 : 0;
                x6Var2.h = i6;
                x6Var2.i = 0;
                a(p4VarA, i6, 0, x6Var2);
            }
            Collections.sort(e);
            s6 s6VarA = a(p4VarA, x6Var2, linkedList, z, true, i4);
            if (s6VarA != null) {
                return new s6[]{s6VarA};
            }
            e = new LinkedList();
            Collections.sort(f);
            HashSet hashSet = new HashSet();
            for (c6 c6Var : f) {
                if (hashSet.add(Integer.valueOf(c6Var.f16028b)) && (i3 = c6Var.f16028b) >= i4 && i3 <= (x6Var.f16419a - 1) - i4) {
                    x6Var2.f16419a = i4;
                    x6Var2.j = true;
                    int i7 = i3 - (i4 / 2);
                    x6Var2.h = i7;
                    x6Var2.i = 0;
                    a(p4VarA, i7, 0, x6Var2);
                }
            }
            Collections.sort(e);
            s6 s6VarA2 = a(p4VarA, x6Var2, linkedList, z, true, i4);
            if (s6VarA2 != null) {
                return new s6[]{s6VarA2};
            }
        } else if (iMin > 500 && x6Var.e && fMax > 3.0f) {
            f16223c = true;
            x6Var2.f16420b = i4;
            int i8 = x6Var.f16420b - 1;
            while (i8 >= 0) {
                i8 -= i4;
                int i9 = i8 >= 0 ? i8 : 0;
                x6Var2.h = 0;
                x6Var2.i = i9;
                a(p4VarA, 0, i9, x6Var2);
            }
            Collections.sort(e);
            s6 s6VarA3 = a(p4VarA, x6Var, linkedList, z, false, i4);
            if (s6VarA3 != null) {
                return new s6[]{s6VarA3};
            }
            e = new LinkedList();
            Collections.sort(g);
            HashSet hashSet2 = new HashSet();
            for (c6 c6Var2 : g) {
                if (hashSet2.add(Integer.valueOf(c6Var2.f16028b)) && (i2 = c6Var2.f16028b) >= i4 && i2 <= (x6Var.f16420b - 1) - i4) {
                    int i10 = i2 - (i4 / 2);
                    x6Var2.f16420b = i4;
                    x6Var2.j = true;
                    x6Var2.h = 0;
                    x6Var2.i = i10;
                    a(p4VarA, 0, i10, x6Var2);
                }
            }
            Collections.sort(e);
            s6 s6VarA4 = a(p4VarA, x6Var, linkedList, z, false, i4);
            if (s6VarA4 != null) {
                return new s6[]{s6VarA4};
            }
        } else {
            f16223c = false;
            if (z) {
                return b(p4VarA, x6Var);
            }
            return a(p4VarA, x6Var);
        }
        s6[] s6VarArr = new s6[linkedList.size()];
        linkedList.toArray(s6VarArr);
        return s6VarArr;
    }

    private static s6 a(p4 p4Var, x6 x6Var, LinkedList linkedList, boolean z, boolean z2, int i2) {
        o1 o1Var = new o1(p4Var);
        List listA = n3.a(x6Var.f16421c);
        if (z) {
            s6 s6VarB = b(e, o1Var, listA);
            if (s6VarB == null || s6VarB.k() == null) {
                return null;
            }
            return s6VarB;
        }
        Iterator it = a(e, o1Var, listA).iterator();
        while (it.hasNext()) {
            linkedList.offer((s6) it.next());
        }
        return null;
    }

    public static s6[] a(Bitmap bitmap, x6 x6Var) {
        o4.b("scankit mul", "start decodeMultiCode pre");
        byte[] bArrB = null;
        try {
            x6Var.f16419a = bitmap.getWidth();
            x6Var.f16420b = bitmap.getHeight();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getByteCount());
            bitmap.copyPixelsToBuffer(byteBufferAllocate);
            byteBufferAllocate.flip();
            bArrB = new m6(x6Var.f16419a, x6Var.f16420b, byteBufferAllocate).b();
            byteBufferAllocate.clear();
        } catch (IllegalArgumentException unused) {
            o4.b(TrackConstants$Events.EXCEPTION, "IllegalArgumentException");
        } catch (OutOfMemoryError unused2) {
            o4.b(TrackConstants$Events.EXCEPTION, "OutOfMemoryError");
        } catch (UnsatisfiedLinkError unused3) {
            o4.b(TrackConstants$Events.EXCEPTION, "UnsatisfiedLinkError");
        } catch (UnsupportedOperationException unused4) {
            o4.b(TrackConstants$Events.EXCEPTION, "UnsupportedArgumentException");
        } catch (Exception unused5) {
            o4.b(TrackConstants$Events.EXCEPTION, "Exception");
        }
        o4.b("scankit mul", "end decodeMultiCode pre");
        return b(bArrB, x6Var);
    }

    public static s6[] a(ByteBuffer byteBuffer, x6 x6Var) {
        return b(byteBuffer.array(), x6Var);
    }

    public static List a(List list, o1 o1Var, List list2) {
        s6 s6VarG;
        boolean z;
        float fMax;
        boolean z2 = false;
        List list3 = (List) list2.get(0);
        boolean z3 = true;
        List list4 = (List) list2.get(1);
        List list5 = (List) list2.get(2);
        List list6 = (List) list2.get(3);
        List list7 = (List) list2.get(4);
        List list8 = (List) list2.get(5);
        List list9 = (List) list2.get(6);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < list.size()) {
            o1Var.i.a();
            j2 j2Var = (j2) list.get(i2);
            boolean z4 = j2Var.g() == 5.0f ? z3 : z2;
            boolean z5 = j2Var.g() == 1.0f ? z3 : false;
            boolean z6 = j2Var.g() == 3.0f ? z3 : false;
            boolean z7 = j2Var.g() == 2.0f ? z3 : false;
            boolean z8 = j2Var.g() == 4.0f ? z3 : false;
            boolean z9 = j2Var.g() == 6.0f ? z3 : false;
            boolean z10 = j2Var.g() == 7.0f ? z3 : false;
            if (r3.f16301b) {
                z4 = j2Var.g() == 1.0f ? z3 : false;
                z5 = j2Var.g() == 2.0f ? z3 : false;
                z6 = j2Var.g() == 2.0f ? z3 : false;
                z8 = j2Var.g() == 1.0f ? z3 : false;
                z7 = j2Var.g() == 2.0f ? z3 : false;
            }
            o4.d("scankit mul", "start cropAndRotate");
            o1Var.b(j2Var);
            o4.d("scankit mul", "end cropAndRotate");
            o4.d("scankit mul", "start decode");
            s6 s6VarE = (a((s6) null) && list3.size() > 0 && z5) ? o1Var.e(list3, j2Var) : null;
            if (a(s6VarE) && list6.size() > 0 && z6) {
                s6VarE = o1Var.b(list6, j2Var);
            }
            if (a(s6VarE) && list5.size() > 0 && z8) {
                s6VarE = o1Var.d(list5, j2Var);
            }
            if (a(s6VarE) && list7.size() > 0 && z7) {
                s6VarE = o1Var.b(list7, j2Var);
            }
            if (a(s6VarE) && list4.size() > 0 && z4) {
                s6VarE = o1Var.a(list4, j2Var);
            }
            if (a(s6VarE) && list8.size() > 0 && z10) {
                s6VarE = o1Var.c(list8, j2Var);
            }
            s6 s6Var = (!a(s6VarE) || list9.size() <= 0 || !z9 || (((double) j2Var.h()) <= 0.6d && !r3.f16302c) || (s6VarE = o1Var.h(list9, j2Var)) == null || o1.b(o1Var.a(), j2Var)) ? s6VarE : null;
            if (r3.g && s6Var != null && o1Var.b()) {
                if (o1Var.e() > 0.0f) {
                    fMax = Math.max(1.0f, o1Var.e());
                } else {
                    fMax = Math.max(1.0f, Math.max(o1Var.c(), o1Var.d()));
                }
                s6 s6Var2 = new s6(fMax);
                z = true;
                s6Var2.c(true);
                arrayList.add(s6Var2);
            } else {
                z = true;
                if (s6Var != null && s6Var.k() != null) {
                    arrayList.add(s6Var);
                }
            }
            i2++;
            z3 = z;
            z2 = false;
        }
        if (arrayList.size() == 0 && list3.size() > 0 && !r3.g && (s6VarG = o1Var.g(list3, null)) != null && s6VarG.k() != null) {
            arrayList.add(s6VarG);
        }
        o4.d("scankit mul", "end decode");
        return arrayList;
    }

    private static s6 a(o1 o1Var, List list, List list2, List list3, List list4) {
        s6 s6VarF = list.size() > 0 ? o1Var.f(list, null) : null;
        if (a(s6VarF) && list3.size() > 0) {
            s6VarF = o1Var.d(list3, null);
        }
        if (a(s6VarF) && list2.size() > 0 && h) {
            s6VarF = o1Var.a(list2, (j2) null);
        }
        return (!a(s6VarF) || list4.size() <= 0) ? s6VarF : o1Var.b(list4, (j2) null);
    }

    public static s6[] a(p4 p4Var, x6 x6Var) {
        s6 s6VarA;
        boolean zP;
        List arrayList = new ArrayList();
        r3.a(x6Var);
        r3.a(1);
        if (x6Var.f16419a >= 30 && x6Var.f16420b >= 30 && p4Var != null) {
            List listA = n3.a(x6Var.f16421c);
            List list = (List) listA.get(0);
            List list2 = (List) listA.get(1);
            List list3 = (List) listA.get(2);
            List list4 = (List) listA.get(3);
            o1 o1Var = new o1(p4Var);
            o4.b("scankit mul", "start detectCodes");
            List listA2 = o1Var.a(1, r3.q);
            o4.b("scankit mul", "end detectCodes");
            if (listA2.size() > 0) {
                arrayList = a(listA2, o1Var, listA);
            } else if ((r3.f16302c || !r3.f16300a) && (s6VarA = a(o1Var, list, list2, list3, list4)) != null && s6VarA.k() != null) {
                arrayList.add(s6VarA);
            }
            List listA3 = v7.a(arrayList);
            if (r3.g && listA3.size() > 0 && ((s6) listA3.get(0)).k() != null) {
                return (s6[]) listA3.toArray(new s6[0]);
            }
            float fMax = 1.0f;
            if (r3.f16302c || !r3.g) {
                zP = false;
            } else {
                if (listA3.size() > 0) {
                    zP = ((s6) listA3.get(0)).p();
                    fMax = Math.max(1.0f, ((s6) listA3.get(0)).l());
                } else {
                    zP = false;
                }
                int i2 = r3.k - 1;
                if (i2 <= 0) {
                    i2 = 0;
                }
                r3.k = i2;
                if (listA2.size() > 0) {
                    zP = zP || o1Var.c(listA2);
                }
                if (zP && o1Var.c(o1Var.a()) < 20.0f) {
                    zP = false;
                }
                if (zP) {
                    fMax = Math.max(fMax, o1Var.e());
                }
            }
            if (r3.g && zP) {
                s6 s6Var = new s6(fMax);
                s6Var.c(true);
                listA3.clear();
                listA3.add(s6Var);
                return (s6[]) listA3.toArray(new s6[0]);
            }
            if (listA3.size() > 0) {
                return (s6[]) listA3.toArray(new s6[0]);
            }
            return new s6[0];
        }
        throw new IllegalArgumentException("width or Height is Illeagle");
    }

    public static s6 a(List list, o1 o1Var) {
        if (list.size() > 0) {
            return o1Var.e(list, null);
        }
        return null;
    }

    private static boolean a(s6 s6Var) {
        return s6Var == null || s6Var.k() == null;
    }

    private static void a(p4 p4Var, int i2, int i3, x6 x6Var) {
        r3.a(x6Var);
        byte[] bArrB = p4Var.a(i2, i3, x6Var.f16419a, x6Var.f16420b).b();
        int i4 = x6Var.f16419a;
        int i5 = x6Var.f16420b;
        List<j2> listA = new o1(new e6(bArrB, i4, i5, 0, 0, i4, i5, false)).a(0, r3.q);
        if (!x6Var.j) {
            a(listA, x6Var);
        }
        for (j2 j2Var : listA) {
            j2Var.a(x6Var.h, x6Var.i);
            e.offer(j2Var);
        }
    }

    private static void a() {
        f16223c = false;
        e = new LinkedList();
        f = new LinkedList();
        g = new LinkedList();
        r3.d = false;
        r3.e = false;
    }

    public static void a(boolean z) {
        r3.f16300a = z;
    }
}
