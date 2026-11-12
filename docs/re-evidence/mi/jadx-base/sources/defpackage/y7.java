package defpackage;

import android.content.Context;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0006B\u001b\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\f"}, d2 = {"Ly7;", "Lph;", "Landroid/content/Context;", "context", "", "originPath", PluginDeviceInfo.FMODEL, "processor", "", "argb", "<init>", "(Lph;[B)V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class y7 implements ph {

    @NotNull
    public static final a c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final ph f39877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final byte[] f39878b;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Ly7$a;", "", "", "INDEX_COLOR_KONGMING_END", "J", "INDEX_COLOR_KONGMING_SET", "INDEX_COLOR_KONGMING_START", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public y7(@Nullable ph phVar, @Nullable byte[] bArr) {
        this.f39877a = phVar;
        this.f39878b = bArr;
    }

    /* JADX WARN: Code duplicated, block: B:109:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0119 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x010f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.ph
    @NotNull
    public String a(@NotNull Context context, @NotNull String originPath) throws Throwable {
        Throwable th;
        FileOutputStream fileOutputStream;
        IOException e;
        FileInputStream fileInputStream;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(originPath, "originPath");
        ph phVar = this.f39877a;
        if (phVar != null) {
            phVar.a(context, originPath);
        }
        FileInputStream fileInputStream2 = null;
        FileOutputStream fileOutputStream2 = null;
        fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(originPath);
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(hct.a(context).toString());
                String str = File.separator;
                sb.append(str);
                sb.append("custom_dial");
                sb.append(str);
                sb.append("ret.bin");
                File file = new File(sb.toString());
                if (file.exists()) {
                    file.delete();
                }
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdir();
                }
                fileOutputStream = new FileOutputStream(file);
                try {
                    Ref.IntRef intRef = new Ref.IntRef();
                    long j = 0;
                    while (true) {
                        int i = fileInputStream.read();
                        intRef.element = i;
                        if (i == -1) {
                            break;
                        }
                        byte[] bArr = this.f39878b;
                        if (bArr == null || j != 54) {
                            if (bArr == null || j < 55 || j > 58) {
                                fileOutputStream.write(i);
                            } else {
                                fileOutputStream.write(bArr[(int) (((((long) bArr.length) + 55) - j) - 1)]);
                            }
                            j++;
                        } else {
                            j++;
                            fileOutputStream.write(1);
                        }
                    }
                    fileInputStream.close();
                    fileOutputStream.close();
                    String path = file.getPath();
                    Intrinsics.checkNotNullExpressionValue(path, "retFile.path");
                    try {
                        fileInputStream.close();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    try {
                        fileOutputStream.close();
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                    return path;
                } catch (IOException e4) {
                    e = e4;
                    fileInputStream2 = fileInputStream;
                    try {
                        t5t.m("DialColorProcessor", "assembleDialWithColor e: " + e);
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (Exception e5) {
                                e5.printStackTrace();
                            }
                        }
                        if (fileOutputStream == null) {
                            return "";
                        }
                        try {
                            fileOutputStream.close();
                            return "";
                        } catch (Exception e6) {
                            e6.printStackTrace();
                            return "";
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        fileOutputStream2 = fileOutputStream;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception e7) {
                                e7.printStackTrace();
                            }
                        }
                        if (fileOutputStream2 != null) {
                            throw th;
                        }
                        try {
                            fileOutputStream2.close();
                            throw th;
                        } catch (Exception e8) {
                            e8.printStackTrace();
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream2 = fileOutputStream;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    if (fileOutputStream2 != null) {
                        throw th;
                    }
                    fileOutputStream2.close();
                    throw th;
                }
            } catch (IOException e9) {
                e = e9;
                fileOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream2 != null) {
                    throw th;
                }
                fileOutputStream2.close();
                throw th;
            }
        } catch (IOException e10) {
            e = e10;
            fileOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = null;
            fileInputStream = fileInputStream2;
            fileOutputStream2 = fileOutputStream;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (fileOutputStream2 != null) {
                throw th;
            }
            fileOutputStream2.close();
            throw th;
        }
    }
}
