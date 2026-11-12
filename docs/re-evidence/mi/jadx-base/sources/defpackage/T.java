package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.data.common.data.annotation.SportDataTypeKt;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.pressure.HMPressureData;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: g3, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n\u001a%\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\f0\u0002*\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0004\u0010\u000e\u001a\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u0002*\u00020\u000f¢\u0006\u0004\b\u0004\u0010\u0012\u001a\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0002*\u00020\u0013¢\u0006\u0004\b\u0004\u0010\u0016\u001a/\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u000b¢\u0006\u0004\b\u0017\u0010\u0018\u001a)\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u000b¢\u0006\u0004\b\u0004\u0010\u0018\u001a\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00140\u0002*\u00020\u0019¢\u0006\u0004\b\u0004\u0010\u001b¨\u0006\u001c"}, d2 = {"T", "Lyg;", "Ldi;", "", PluginDeviceInfo.FMODEL, "(Lyg;)Ldi;", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "Ltg;", "", "type", "(Lcom/xiaomi/hm/health/bt/device/HMCallback;I)Ldi;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;", "Ljava/io/File;", "file", "(Lcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;Ljava/io/File;)Ldi;", "Lzos;", "Lk3t;", "Li;", "(Lzos;)Ldi;", "Lc0t;", "", "Lvzs;", "(Lc0t;)Ldi;", PluginDeviceInfo.FDESC, "(Lcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;)Ldi;", "Lki;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/pressure/HMPressureData;", "(Lki;)Ldi;", "bluetooth_release"}, k = 2, mv = {1, 7, 1})
public final class T {

    /* JADX INFO: renamed from: g3$a */
    @Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u00020\u00042\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\n\u0010\u0011J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\n\u0010\u0014J\u001d\u0010\n\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00150\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000e¨\u0006\u0016"}, d2 = {"g3$a", "Ldi;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/pressure/HMPressureData;", "", LifecycleConstantKt.ON_START, "()V", "", "current", SportDataTypeKt.DIMEN_TOTAL, PluginDeviceInfo.FMODEL, "(JJ)V", "data", "onData", "(Ljava/util/List;)V", "Lf4s;", "header", "(Lf4s;)V", "Lmb;", "code", "(Lmb;)V", "Lwp;", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements di<List<? extends HMPressureData>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ArrayList<HMPressureData> f18520a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ki f18521b;

        public a(ki kiVar) {
            this.f18521b = kiVar;
        }

        @Override // defpackage.di
        public void a(long current, long total) {
        }

        @Override // defpackage.di
        public void onData(@NotNull List<? extends List<? extends HMPressureData>> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            Iterator<T> it = data.iterator();
            while (it.hasNext()) {
                this.f18520a.addAll((List) it.next());
            }
        }

        @Override // defpackage.di
        public void onStart() {
            this.f18521b.onPressureStart();
        }

        @Override // defpackage.di
        public void a(@NotNull f4s header) {
            Intrinsics.checkNotNullParameter(header, "header");
        }

        @Override // defpackage.di
        public void a(@NotNull List<RawData> data) {
            Intrinsics.checkNotNullParameter(data, "data");
        }

        @Override // defpackage.di
        public void a(@NotNull mb code) {
            Intrinsics.checkNotNullParameter(code, "code");
            this.f18521b.a(this.f18520a);
            this.f18521b.onPressureStop(nb.a(code));
        }
    }

    /* JADX INFO: renamed from: g3$b */
    @Metadata(d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\t\u0010\u0011J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\t\u0010\u0014J\u001d\u0010\t\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00150\u000bH\u0016¢\u0006\u0004\b\t\u0010\u000e¨\u0006\u0016"}, d2 = {"g3$b", "Ldi;", "", "", LifecycleConstantKt.ON_START, "()V", "", "current", SportDataTypeKt.DIMEN_TOTAL, PluginDeviceInfo.FMODEL, "(JJ)V", "", "data", "onData", "(Ljava/util/List;)V", "Lf4s;", "header", "(Lf4s;)V", "Lmb;", "code", "(Lmb;)V", "Lwp;", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements di<byte[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public f4s f18522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ yg<T> f18523b;

        public b(yg<T> ygVar) {
            this.f18523b = ygVar;
        }

        @Override // defpackage.di
        public void a(@NotNull List<RawData> data) {
            Intrinsics.checkNotNullParameter(data, "data");
        }

        @Override // defpackage.di
        public void onData(@NotNull List<? extends byte[]> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            yg<T> ygVar = this.f18523b;
            for (byte[] bArr : data) {
                f4s f4sVar = this.f18522a;
                if (f4sVar != null) {
                    int f33603a = ygVar.getF33603a();
                    Calendar calendar = f4sVar.f17406a;
                    Intrinsics.checkNotNullExpressionValue(calendar, "it.calendar");
                    ygVar.onData(new HmGdspRawData(f33603a, calendar, bArr, f4sVar.d));
                }
            }
        }

        @Override // defpackage.di
        public void onStart() {
            this.f18523b.onStart();
        }

        @Override // defpackage.di
        public void a(long current, long total) {
            this.f18523b.onProgress(new Progress((int) total, (int) current));
        }

        @Override // defpackage.di
        public void a(@NotNull f4s header) {
            Intrinsics.checkNotNullParameter(header, "header");
            this.f18522a = header;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // defpackage.di
        public void a(@NotNull mb code) {
            Intrinsics.checkNotNullParameter(code, "code");
            this.f18523b.onFinish(nb.a(code));
        }
    }

    /* JADX INFO: renamed from: g3$c */
    @Metadata(d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\t\u0010\u0011J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\t\u0010\u0014J\u001d\u0010\t\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00150\u000bH\u0016¢\u0006\u0004\b\t\u0010\u000e¨\u0006\u0016"}, d2 = {"g3$c", "Ldi;", "", "", LifecycleConstantKt.ON_START, "()V", "", "current", SportDataTypeKt.DIMEN_TOTAL, PluginDeviceInfo.FMODEL, "(JJ)V", "", "data", "onData", "(Ljava/util/List;)V", "Lf4s;", "header", "(Lf4s;)V", "Lmb;", "code", "(Lmb;)V", "Lwp;", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class c implements di<byte[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public f4s f18524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ HMCallback<HmGdspRawData> f18525b;
        public final /* synthetic */ int c;

        public c(HMCallback<HmGdspRawData> hMCallback, int i) {
            this.f18525b = hMCallback;
            this.c = i;
        }

        @Override // defpackage.di
        public void a(@NotNull List<RawData> data) {
            Intrinsics.checkNotNullParameter(data, "data");
        }

        @Override // defpackage.di
        public void onData(@NotNull List<? extends byte[]> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            HMCallback<HmGdspRawData> hMCallback = this.f18525b;
            int i = this.c;
            for (byte[] bArr : data) {
                f4s f4sVar = this.f18524a;
                if (f4sVar != null) {
                    Calendar calendar = f4sVar.f17406a;
                    Intrinsics.checkNotNullExpressionValue(calendar, "it.calendar");
                    hMCallback.onData(new HmGdspRawData(i, calendar, bArr, f4sVar.d));
                }
            }
        }

        @Override // defpackage.di
        public void onStart() {
            this.f18525b.onStart();
        }

        @Override // defpackage.di
        public void a(long current, long total) {
            this.f18525b.onProgress(new Progress((int) total, (int) current));
        }

        @Override // defpackage.di
        public void a(@NotNull f4s header) {
            Intrinsics.checkNotNullParameter(header, "header");
            this.f18524a = header;
        }

        @Override // defpackage.di
        public void a(@NotNull mb code) {
            Intrinsics.checkNotNullParameter(code, "code");
            this.f18525b.onFinish(nb.a(code));
        }
    }

    /* JADX INFO: renamed from: g3$d */
    @Metadata(d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\t\u0010\u0011J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\t\u0010\u0014J\u001d\u0010\t\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00150\u000bH\u0016¢\u0006\u0004\b\t\u0010\u000e¨\u0006\u0016"}, d2 = {"g3$d", "Ldi;", "Ljava/io/File;", "", LifecycleConstantKt.ON_START, "()V", "", "current", SportDataTypeKt.DIMEN_TOTAL, PluginDeviceInfo.FMODEL, "(JJ)V", "", "data", "onData", "(Ljava/util/List;)V", "Lf4s;", "header", "(Lf4s;)V", "Lmb;", "code", "(Lmb;)V", "Lwp;", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class d implements di<File> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f18526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f18527b;
        public final /* synthetic */ IHMDataCallback<File> c;
        public final /* synthetic */ File d;

        public d(IHMDataCallback<File> iHMDataCallback, File file) {
            this.c = iHMDataCallback;
            this.d = file;
            this.f18526a = iHMDataCallback instanceof li;
        }

        @Override // defpackage.di
        public void a(@NotNull f4s header) {
            Intrinsics.checkNotNullParameter(header, "header");
        }

        @Override // defpackage.di
        public void onData(@NotNull List<? extends File> data) {
            Intrinsics.checkNotNullParameter(data, "data");
        }

        @Override // defpackage.di
        public void onStart() {
            this.c.onStart();
            this.f18527b = System.currentTimeMillis();
        }

        @Override // defpackage.di
        public void a(long current, long total) {
            Progress progress = new Progress((int) total, (int) current);
            this.c.onProgress(progress);
            if (current != total) {
                progress = null;
            }
            if (progress != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format(Locale.getDefault(), "LOG transfer rate: %.1f KBps", Arrays.copyOf(new Object[]{Float.valueOf(progress.total / (System.currentTimeMillis() - this.f18527b))}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
                t5t.d("HMSyncLogTask", str);
            }
        }

        @Override // defpackage.di
        public void a(@NotNull mb code) {
            Intrinsics.checkNotNullParameter(code, "code");
            this.c.onStop(this.d, nb.b(code));
        }

        @Override // defpackage.di
        public void a(@NotNull List<RawData> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            if (this.f18526a) {
                IHMDataCallback<File> iHMDataCallback = this.c;
                Intrinsics.checkNotNull(iHMDataCallback, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.profile.gdsp.IHMRawDataCallback<java.io.File>");
                ((li) iHMDataCallback).a(data);
            }
        }
    }

    /* JADX INFO: renamed from: g3$e */
    @Metadata(d1 = {"\u0000?\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u00020\u00042\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\n\u0010\u0012J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\n\u0010\u0015J\u001d\u0010\n\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00160\fH\u0016¢\u0006\u0004\b\n\u0010\u000f¨\u0006\u0017"}, d2 = {"g3$e", "Ldi;", "Lk3t;", "Li;", "", LifecycleConstantKt.ON_START, "()V", "", "current", SportDataTypeKt.DIMEN_TOTAL, PluginDeviceInfo.FMODEL, "(JJ)V", "", "data", "onData", "(Ljava/util/List;)V", "Lf4s;", "header", "(Lf4s;)V", "Lmb;", "code", "(Lmb;)V", "Lwp;", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class e implements di<k3t<i>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ zos f18528a;

        public e(zos zosVar) {
            this.f18528a = zosVar;
        }

        @Override // defpackage.di
        public void a(@NotNull f4s header) {
            Intrinsics.checkNotNullParameter(header, "header");
        }

        @Override // defpackage.di
        public void onData(@NotNull List<? extends k3t<i>> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f18528a.a((List<k3t>) data);
        }

        @Override // defpackage.di
        public void onStart() {
            this.f18528a.a();
        }

        @Override // defpackage.di
        public void a(@NotNull List<RawData> data) {
            Intrinsics.checkNotNullParameter(data, "data");
        }

        @Override // defpackage.di
        public void a(long current, long total) {
            this.f18528a.a(new Progress((int) total, (int) current));
        }

        @Override // defpackage.di
        public void a(@NotNull mb code) {
            Intrinsics.checkNotNullParameter(code, "code");
            zos zosVar = this.f18528a;
            tdt tdtVar = new tdt(nb.b(code).getError());
            tdtVar.a(code == mb.PACKET_INDEX_ERROR);
            zosVar.a(tdtVar);
        }
    }

    /* JADX INFO: renamed from: g3$f */
    @Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u00020\u00042\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\n\u0010\u0011J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\n\u0010\u0014J\u001d\u0010\n\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00150\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000e¨\u0006\u0016"}, d2 = {"g3$f", "Ldi;", "", "Lvzs;", "", LifecycleConstantKt.ON_START, "()V", "", "current", SportDataTypeKt.DIMEN_TOTAL, PluginDeviceInfo.FMODEL, "(JJ)V", "data", "onData", "(Ljava/util/List;)V", "Lf4s;", "header", "(Lf4s;)V", "Lmb;", "code", "(Lmb;)V", "Lwp;", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class f implements di<List<? extends vzs>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ArrayList<vzs> f18529a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c0t f18530b;

        public f(c0t c0tVar) {
            this.f18530b = c0tVar;
        }

        @Override // defpackage.di
        public void a(long current, long total) {
        }

        @Override // defpackage.di
        public void onData(@NotNull List<? extends List<? extends vzs>> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            Iterator<T> it = data.iterator();
            while (it.hasNext()) {
                this.f18529a.addAll((List) it.next());
            }
        }

        @Override // defpackage.di
        public void onStart() {
            this.f18530b.a();
        }

        @Override // defpackage.di
        public void a(@NotNull f4s header) {
            Intrinsics.checkNotNullParameter(header, "header");
        }

        @Override // defpackage.di
        public void a(@NotNull List<RawData> data) {
            Intrinsics.checkNotNullParameter(data, "data");
        }

        @Override // defpackage.di
        public void a(@NotNull mb code) {
            Intrinsics.checkNotNullParameter(code, "code");
            if (code == mb.SUCCESS) {
                this.f18530b.a(this.f18529a);
            }
            this.f18530b.a(nb.a(code));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: g3$g */
    @Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\b\u0010\u0010J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\b\u0010\u0013J\u001d\u0010\b\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00140\nH\u0016¢\u0006\u0004\b\b\u0010\r¨\u0006\u0015"}, d2 = {"g3$g", "Ldi;", "", LifecycleConstantKt.ON_START, "()V", "", "current", SportDataTypeKt.DIMEN_TOTAL, PluginDeviceInfo.FMODEL, "(JJ)V", "", "data", "onData", "(Ljava/util/List;)V", "Lf4s;", "header", "(Lf4s;)V", "Lmb;", "code", "(Lmb;)V", "Lwp;", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class g<T> implements di<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ArrayList<T> f18531a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ IHMDataCallback<List<T>> f18532b;

        public g(IHMDataCallback<List<T>> iHMDataCallback) {
            this.f18532b = iHMDataCallback;
        }

        @Override // defpackage.di
        public void a(@NotNull f4s header) {
            Intrinsics.checkNotNullParameter(header, "header");
        }

        @Override // defpackage.di
        public void onData(@NotNull List<? extends T> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f18531a.addAll(data);
        }

        @Override // defpackage.di
        public void onStart() {
            this.f18532b.onStart();
        }

        @Override // defpackage.di
        public void a(long current, long total) {
            int i = (int) total;
            this.f18532b.onProgress(new Progress(i, i));
        }

        @Override // defpackage.di
        public void a(@NotNull mb code) {
            Intrinsics.checkNotNullParameter(code, "code");
            this.f18532b.onStop(this.f18531a, nb.b(code));
        }

        @Override // defpackage.di
        public void a(@NotNull List<RawData> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            if (this instanceof li) {
                IHMDataCallback<List<T>> iHMDataCallback = this.f18532b;
                Intrinsics.checkNotNull(iHMDataCallback, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.profile.gdsp.IHMRawDataCallback<*>");
                ((li) iHMDataCallback).a(data);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: g3$h */
    @Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\f\u001a\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\t\u0010\u0010J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\t\u0010\u0013J\u001d\u0010\t\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00140\u0002H\u0016¢\u0006\u0004\b\t\u0010\r¨\u0006\u0015"}, d2 = {"g3$h", "Ldi;", "", "", LifecycleConstantKt.ON_START, "()V", "", "current", SportDataTypeKt.DIMEN_TOTAL, PluginDeviceInfo.FMODEL, "(JJ)V", "data", "onData", "(Ljava/util/List;)V", "Lf4s;", "header", "(Lf4s;)V", "Lmb;", "code", "(Lmb;)V", "Lwp;", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class h<T> implements di<List<? extends T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ArrayList<T> f18533a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ IHMDataCallback<List<T>> f18534b;

        public h(IHMDataCallback<List<T>> iHMDataCallback) {
            this.f18534b = iHMDataCallback;
        }

        @Override // defpackage.di
        public void a(@NotNull f4s header) {
            Intrinsics.checkNotNullParameter(header, "header");
        }

        @Override // defpackage.di
        public void onData(@NotNull List<? extends List<? extends T>> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            Iterator<T> it = data.iterator();
            while (it.hasNext()) {
                this.f18533a.addAll((List) it.next());
            }
        }

        @Override // defpackage.di
        public void onStart() {
            this.f18534b.onStart();
        }

        @Override // defpackage.di
        public void a(long current, long total) {
            int i = (int) total;
            this.f18534b.onProgress(new Progress(i, i));
        }

        @Override // defpackage.di
        public void a(@NotNull mb code) {
            Intrinsics.checkNotNullParameter(code, "code");
            this.f18534b.onStop(this.f18533a, nb.b(code));
        }

        @Override // defpackage.di
        public void a(@NotNull List<RawData> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            if (this instanceof li) {
                IHMDataCallback<List<T>> iHMDataCallback = this.f18534b;
                Intrinsics.checkNotNull(iHMDataCallback, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.profile.gdsp.IHMRawDataCallback<*>");
                ((li) iHMDataCallback).a(data);
            }
        }
    }

    @NotNull
    public static final <T> di<byte[]> a(@NotNull yg<T> ygVar) {
        Intrinsics.checkNotNullParameter(ygVar, "<this>");
        return new b(ygVar);
    }

    @NotNull
    public static final <T> di<List<T>> b(@NotNull IHMDataCallback<List<T>> iHMDataCallback) {
        Intrinsics.checkNotNullParameter(iHMDataCallback, "<this>");
        return new h(iHMDataCallback);
    }

    @NotNull
    public static final di<byte[]> a(@NotNull HMCallback<HmGdspRawData> hMCallback, int i) {
        Intrinsics.checkNotNullParameter(hMCallback, "<this>");
        return new c(hMCallback, i);
    }

    @NotNull
    public static final di<File> a(@NotNull IHMDataCallback<File> iHMDataCallback, @NotNull File file) {
        Intrinsics.checkNotNullParameter(iHMDataCallback, "<this>");
        Intrinsics.checkNotNullParameter(file, "file");
        return new d(iHMDataCallback, file);
    }

    @NotNull
    public static final di<k3t<i>> a(@NotNull zos zosVar) {
        Intrinsics.checkNotNullParameter(zosVar, "<this>");
        return new e(zosVar);
    }

    @NotNull
    public static final di<List<vzs>> a(@NotNull c0t c0tVar) {
        Intrinsics.checkNotNullParameter(c0tVar, "<this>");
        return new f(c0tVar);
    }

    @NotNull
    public static final <T> di<T> a(@NotNull IHMDataCallback<List<T>> iHMDataCallback) {
        Intrinsics.checkNotNullParameter(iHMDataCallback, "<this>");
        return new g(iHMDataCallback);
    }

    @NotNull
    public static final di<List<HMPressureData>> a(@NotNull ki kiVar) {
        Intrinsics.checkNotNullParameter(kiVar, "<this>");
        return new a(kiVar);
    }
}
