package zv;

import bs2.b7;
import bs2.ck;
import bs2.id;
import bs2.jd;
import bs2.q00;
import bs2.r00;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.fit.FitRuntimeException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lzv/i;", "", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q00 f207153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public id f207154b;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"zv/i$b", "Lbs2/jd;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements jd {
        public b() {
        }

        @Override // bs2.jd
        public final void a(id idVar) {
            i.this.f207154b = idVar;
        }
    }

    static {
        new a(null);
    }

    public final boolean a(String str) throws Throwable {
        str.getClass();
        b7 b7Var = new b7();
        ck ckVar = new ck(b7Var);
        FileInputStream fileInputStream = null;
        try {
            try {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(str);
                    try {
                        if (!b7Var.b(fileInputStream2)) {
                            i2.a aVar = i2.f36769a;
                            a2 a2Var = a2.GENERAL;
                            aVar.getClass();
                            i2.a.b(a2Var, "OrcaSettingsFITParser", "Failed to open or integrity check failed.");
                            try {
                                fileInputStream2.close();
                            } catch (IOException unused) {
                            }
                            return false;
                        }
                        try {
                            fileInputStream2.close();
                            Unit unit = Unit.INSTANCE;
                        } catch (IOException unused2) {
                            Unit unit2 = Unit.INSTANCE;
                        }
                        try {
                            FileInputStream fileInputStream3 = new FileInputStream(str);
                            ckVar.f19814d0.add(new r00() { // from class: zv.h
                                @Override // bs2.r00
                                public final void a(q00 q00Var) {
                                    this.f207152a.f207153a = q00Var;
                                }
                            });
                            ckVar.f19832f.add(new b());
                            try {
                                try {
                                    ckVar.c(fileInputStream3);
                                    try {
                                        fileInputStream3.close();
                                        return true;
                                    } catch (IOException unused3) {
                                        return true;
                                    }
                                } catch (Throwable th3) {
                                    try {
                                        fileInputStream3.close();
                                    } catch (IOException unused4) {
                                    }
                                    throw th3;
                                }
                            } catch (FitRuntimeException e4) {
                                String str2 = "FitRuntimeException parsing swing file: " + e4.getMessage();
                                i2.a aVar2 = i2.f36769a;
                                a2 a2Var2 = a2.GENERAL;
                                aVar2.getClass();
                                i2.a.b(a2Var2, "OrcaSettingsFITParser", str2);
                                fileInputStream3.close();
                            }
                        } catch (FileNotFoundException e14) {
                            e14.printStackTrace();
                            return false;
                        }
                    } catch (IOException e15) {
                        e = e15;
                        fileInputStream = fileInputStream2;
                        String str3 = "IOException opening swing file for integrity check: " + e.getMessage();
                        i2.a aVar3 = i2.f36769a;
                        a2 a2Var3 = a2.GENERAL;
                        aVar3.getClass();
                        i2.a.b(a2Var3, "OrcaSettingsFITParser", str3);
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused5) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (IOException e16) {
                e = e16;
            }
        } catch (IOException unused6) {
        }
        return false;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzv/i$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
