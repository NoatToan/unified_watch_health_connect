package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.wearable.hm.BroadcastsKt;
import java.util.ArrayList;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003:\u0001\u0013B+\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0005\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"La5;", "T", "Li7t;", "", "", "doWork", "()V", "", "reason", "notExecute", "(Ljava/lang/String;)V", "Ljet;", "gattPeripheral", "Lf1;", "param", "Ldi;", "callback", "<init>", "(Ljet;Lf1;Ldi;)V", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class a5<T> extends i7t {

    @NotNull
    public static final a x = new a(null);

    @NotNull
    public final jet t;

    @NotNull
    public final f1<T> u;

    @NotNull
    public final di<T> v;

    @Nullable
    public wb w;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"La5$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: a5$b, reason: from Kotlin metadata */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", BroadcastsKt.SILENT_PUSHING_PROGRESS, "", PluginDeviceInfo.FMODEL, "(Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;)V"}, k = 3, mv = {1, 7, 1})
    public static final class T extends Lambda implements Function1<Progress, Unit> {
        public final /* synthetic */ a5<T> t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public T(a5<T> a5Var) {
            super(1);
            this.t = a5Var;
        }

        public final void a(@NotNull Progress progress) {
            Intrinsics.checkNotNullParameter(progress, "progress");
            this.t.v.a(progress.progress, progress.total);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(Progress progress) {
            a(progress);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: a5$c, reason: from Kotlin metadata and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class C1173c extends Lambda implements Function0<String> {
        public final /* synthetic */ Calendar t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1173c(Calendar calendar) {
            super(0);
            this.t = calendar;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "next sync time:" + this.t + " error, abort sync data";
        }
    }

    /* JADX INFO: renamed from: a5$d, reason: from Kotlin metadata and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class C1174d extends Lambda implements Function0<String> {
        public final /* synthetic */ String t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1174d(String str) {
            super(0);
            this.t = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "not execute reason:" + this.t;
        }
    }

    public a5(@NotNull jet gattPeripheral, @NotNull f1<T> param, @NotNull di<T> callback) {
        Intrinsics.checkNotNullParameter(gattPeripheral, "gattPeripheral");
        Intrinsics.checkNotNullParameter(param, "param");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.t = gattPeripheral;
        this.u = param;
        this.v = callback;
    }

    @Override // defpackage.i7t
    @ExperimentalCoroutinesApi
    public void doWork() {
        mb mbVarA;
        Calendar calendar;
        Calendar calendar2;
        Calendar calendar3;
        this.v.onStart();
        Object objClone = this.u.getF17275a().clone();
        Intrinsics.checkNotNull(objClone, "null cannot be cast to non-null type java.util.Calendar");
        Calendar calendar4 = (Calendar) objClone;
        Object objClone2 = calendar4.clone();
        Intrinsics.checkNotNull(objClone2, "null cannot be cast to non-null type java.util.Calendar");
        Calendar calendar5 = (Calendar) objClone2;
        int d = this.u.getD();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        kc kcVarA = xb.f38931a.a(this.t, this.u.getC());
        if (!kcVarA.init()) {
            t5t.d("CommonGdspSyncTask", "sync data init fail");
            this.v.a(mb.OPERATION_FAILED);
            return;
        }
        while (true) {
            ArrayList arrayList3 = new ArrayList();
            this.u.a().a(new T(this));
            wb wbVar = new wb(kcVarA, this.u.getC());
            this.w = wbVar;
            mbVarA = wbVar.a(this.u.getF17276b(), calendar5, this.u.a(), this.u.e(), this.u.d());
            mb mbVar = mb.SUCCESS;
            if (mbVarA != mbVar) {
                d--;
                t5t.d("CommonGdspSyncTask", "sync fail and retryCount:" + d);
            } else {
                f4s v = this.u.a().getV();
                if (v != null) {
                    this.v.a(v);
                }
                f4s v2 = this.u.a().getV();
                if (v2 == null || v2.f17407b <= 0) {
                    calendar = calendar4;
                } else {
                    T tB = this.u.a().b();
                    arrayList3.add(tB);
                    byte[] bArrA = this.u.a().a();
                    f4s v3 = this.u.a().getV();
                    if (v3 == null || (calendar3 = v3.f17406a) == null) {
                        calendar3 = Calendar.getInstance();
                    }
                    calendar = calendar4;
                    Intrinsics.checkNotNullExpressionValue(calendar3, "param.dataReceiver.getDa…?: Calendar.getInstance()");
                    arrayList2.add(new RawData(bArrA, calendar3));
                    if (this.u.j()) {
                        this.v.onData(arrayList3);
                    } else {
                        arrayList.add(tB);
                    }
                    f1<T> f1Var = this.u;
                    Calendar calendarA = f1Var.a(f1Var.a().getV(), tB);
                    if (calendarA != null) {
                        Object objClone3 = calendarA.clone();
                        Intrinsics.checkNotNull(objClone3, "null cannot be cast to non-null type java.util.Calendar");
                        calendar = (Calendar) objClone3;
                    }
                    if ((calendarA != null ? calendarA.getTimeInMillis() : 0L) > calendar5.getTimeInMillis()) {
                        calendar2 = calendarA;
                        calendar4 = calendar;
                    } else {
                        le.c("CommonGdspSyncTask", new C1173c(calendarA));
                    }
                    calendar5 = calendar2;
                }
                calendar4 = calendar;
                calendar2 = null;
                calendar5 = calendar2;
            }
            if (!this.u.getH() || calendar5 == null || (mbVarA != mbVar && d <= 0)) {
                break;
            }
        }
        kcVarA.deInit();
        T tA = this.u.a().a(calendar4);
        if (tA != null) {
            arrayList.add(tA);
        }
        if (this.u.i()) {
            this.v.onData(arrayList);
        }
        this.v.a(arrayList2);
        this.v.a(mbVarA);
    }

    @Override // defpackage.i7t, defpackage.nh
    public void notExecute(@NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        le.c("CommonGdspSyncTask", new C1174d(reason));
        this.v.onStart();
        this.v.a(mb.NO_CONNECTION);
    }
}
