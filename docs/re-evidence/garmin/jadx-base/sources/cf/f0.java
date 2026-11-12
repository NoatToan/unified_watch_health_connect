package cf;

import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashSet;
import java.util.Set;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ue.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcf/f0;", "", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f26916b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f26917c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f26918d;

        static {
            int[] iArr = new int[h0.c.values().length];
            try {
                iArr[h0.c.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h0.c.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h0.c.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h0.c.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[h0.c.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[h0.c.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f26915a = iArr;
            int[] iArr2 = new int[ue.a.values().length];
            try {
                iArr2[ue.a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ue.a.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f26916b = iArr2;
            int[] iArr3 = new int[ue.v.values().length];
            try {
                iArr3[ue.v.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[ue.v.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[ue.v.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[ue.v.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[ue.v.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            f26917c = iArr3;
            int[] iArr4 = new int[ue.b0.values().length];
            try {
                iArr4[ue.b0.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[ue.b0.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            f26918d = iArr4;
        }
    }

    static {
        new f0();
    }

    private f0() {
    }

    public static final LinkedHashSet a(byte[] bArr) throws IOException {
        bArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i14 = objectInputStream.readInt();
                    for (int i15 = 0; i15 < i14; i15++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean z14 = objectInputStream.readBoolean();
                        uri.getClass();
                        linkedHashSet.add(new ue.f.c(uri, z14));
                    }
                    Unit unit = Unit.INSTANCE;
                    objectInputStream.close();
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        jg.b.l(objectInputStream, th3);
                        throw th4;
                    }
                }
            } catch (IOException e4) {
                e4.printStackTrace();
            }
            Unit unit2 = Unit.INSTANCE;
            byteArrayInputStream.close();
            return linkedHashSet;
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                jg.b.l(byteArrayInputStream, th5);
                throw th6;
            }
        }
    }

    public static final byte[] b(df.m mVar) throws IOException {
        mVar.getClass();
        NetworkRequest networkRequest = (NetworkRequest) mVar.f59414a;
        if (networkRequest == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                int[] iArrB = df.n.b(networkRequest);
                int[] iArrA = df.n.a(networkRequest);
                objectOutputStream.writeInt(iArrB.length);
                for (int i14 : iArrB) {
                    objectOutputStream.writeInt(i14);
                }
                objectOutputStream.writeInt(iArrA.length);
                for (int i15 : iArrA) {
                    objectOutputStream.writeInt(i15);
                }
                Unit unit = Unit.INSTANCE;
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    jg.b.l(objectOutputStream, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                jg.b.l(byteArrayOutputStream, th5);
                throw th6;
            }
        }
    }

    public static final ue.a c(int i14) {
        if (i14 == 0) {
            return ue.a.EXPONENTIAL;
        }
        if (i14 == 1) {
            return ue.a.LINEAR;
        }
        vb.h.s(v.e0.f(i14, "Could not convert ", " to BackoffPolicy"));
        return null;
    }

    public static final ue.v d(int i14) {
        if (i14 == 0) {
            return ue.v.NOT_REQUIRED;
        }
        if (i14 == 1) {
            return ue.v.CONNECTED;
        }
        if (i14 == 2) {
            return ue.v.UNMETERED;
        }
        if (i14 == 3) {
            return ue.v.NOT_ROAMING;
        }
        if (i14 == 4) {
            return ue.v.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i14 == 5) {
            return ue.v.TEMPORARILY_UNMETERED;
        }
        vb.h.s(v.e0.f(i14, "Could not convert ", " to NetworkType"));
        return null;
    }

    public static final ue.b0 e(int i14) {
        if (i14 == 0) {
            return ue.b0.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i14 == 1) {
            return ue.b0.DROP_WORK_REQUEST;
        }
        vb.h.s(v.e0.f(i14, "Could not convert ", " to OutOfQuotaPolicy"));
        return null;
    }

    public static final h0.c f(int i14) {
        if (i14 == 0) {
            return h0.c.ENQUEUED;
        }
        if (i14 == 1) {
            return h0.c.RUNNING;
        }
        if (i14 == 2) {
            return h0.c.SUCCEEDED;
        }
        if (i14 == 3) {
            return h0.c.FAILED;
        }
        if (i14 == 4) {
            return h0.c.BLOCKED;
        }
        if (i14 == 5) {
            return h0.c.CANCELLED;
        }
        vb.h.s(v.e0.f(i14, "Could not convert ", " to State"));
        return null;
    }

    public static final int g(ue.v vVar) {
        vVar.getClass();
        int i14 = a.f26917c[vVar.ordinal()];
        if (i14 == 1) {
            return 0;
        }
        if (i14 == 2) {
            return 1;
        }
        if (i14 == 3) {
            return 2;
        }
        if (i14 == 4) {
            return 3;
        }
        if (i14 == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && vVar == ue.v.TEMPORARILY_UNMETERED) {
            return 5;
        }
        org.apache.commons.lang3.e.l("Could not convert ", vVar, " to int");
        return 0;
    }

    public static final byte[] h(Set<ue.f.c> set) throws IOException {
        set.getClass();
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                for (ue.f.c cVar : set) {
                    objectOutputStream.writeUTF(cVar.f170061a.toString());
                    objectOutputStream.writeBoolean(cVar.f170062b);
                }
                Unit unit = Unit.INSTANCE;
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    jg.b.l(objectOutputStream, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                jg.b.l(byteArrayOutputStream, th5);
                throw th6;
            }
        }
    }

    public static final int i(h0.c cVar) {
        cVar.getClass();
        switch (a.f26915a[cVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                u0.r();
                return 0;
        }
    }

    public static final df.m j(byte[] bArr) throws IOException {
        bArr.getClass();
        if (bArr.length == 0) {
            return new df.m(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i14 = objectInputStream.readInt();
                int[] iArr = new int[i14];
                for (int i15 = 0; i15 < i14; i15++) {
                    iArr[i15] = objectInputStream.readInt();
                }
                int i16 = objectInputStream.readInt();
                int[] iArr2 = new int[i16];
                for (int i17 = 0; i17 < i16; i17++) {
                    iArr2[i17] = objectInputStream.readInt();
                }
                df.k.f59411a.getClass();
                df.m mVarA = df.k.a(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return mVarA;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    jg.b.l(objectInputStream, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                jg.b.l(byteArrayInputStream, th5);
                throw th6;
            }
        }
    }
}
