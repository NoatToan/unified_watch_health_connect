package defpackage;

import com.huami.bluetooth.profile.channel.module.openapp.entities.ActivityData;
import com.huami.bluetooth.profile.channel.module.openapp.entities.CalorieData;
import com.huami.bluetooth.profile.channel.module.openapp.entities.FatBurningData;
import com.huami.bluetooth.profile.channel.module.openapp.entities.SitWalkRun;
import com.huami.bluetooth.profile.channel.module.openapp.entities.StandData;
import com.huami.bluetooth.profile.channel.module.openapp.entities.StepsData;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\b\u001a\u00020\u0007H\u0002¨\u0006\u0014"}, d2 = {"Lm;", "", "", "data", "", "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/ActivityData;", PluginDeviceInfo.FMODEL, "Lw2;", "bufDecoder", "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/StepsData;", PluginDeviceInfo.FICONOFFLINE, "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/CalorieData;", "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/FatBurningData;", PluginDeviceInfo.FDESC, "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/SitWalkRun;", PluginDeviceInfo.FICONON, "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/StandData;", PluginDeviceInfo.FICONOFF, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f25596a = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lm$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(0);
            this.t = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "exception: " + this.t;
        }
    }

    @NotNull
    public final List<ActivityData> a(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        ArrayList arrayList = new ArrayList();
        w2 w2Var = new w2(data, data.length);
        do {
            try {
                ActivityData activityData = new ActivityData(w2.b(w2Var, 0, 1, null), w2.b(w2Var, 0, 1, null), w2.b(w2Var, 0, 1, null), w2.b(w2Var, 0, 1, null), w2Var.b(), w2Var.e(), e(w2Var), a(w2Var), b(w2Var), c(w2Var), d(w2Var));
                t5t.d("ActivityTodayProfile", "parsed activity data: " + activityData);
                arrayList.add(activityData);
            } catch (Exception e) {
                le.c("ActivityTodayProfile", new b(e));
            }
        } while (w2Var.h() > 0);
        return arrayList;
    }

    public final FatBurningData b(w2 bufDecoder) {
        try {
            int iE = bufDecoder.e();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 48; i++) {
                arrayList.add(Integer.valueOf(bufDecoder.c()));
            }
            return new FatBurningData(iE, arrayList, bufDecoder.e(), bufDecoder.e());
        } catch (IndexOutOfBoundsException unused) {
            t5t.d("ActivityTodayProfile", "getFatBurningData: IndexOutOfBoundsException");
            return null;
        }
    }

    public final SitWalkRun c(w2 bufDecoder) {
        try {
            return new SitWalkRun(w2.b(bufDecoder, 0, 1, null), w2.b(bufDecoder, 0, 1, null), w2.b(bufDecoder, 0, 1, null));
        } catch (IndexOutOfBoundsException unused) {
            t5t.d("ActivityTodayProfile", "getSitWalkRunData: IndexOutOfBoundsException");
            return null;
        }
    }

    public final StandData d(w2 bufDecoder) {
        try {
            int iC = bufDecoder.c();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 24; i++) {
                arrayList.add(Integer.valueOf(bufDecoder.c()));
            }
            return new StandData(iC, arrayList, bufDecoder.c(), w2.b(bufDecoder, 0, 1, null), w2.b(bufDecoder, 0, 1, null));
        } catch (IndexOutOfBoundsException unused) {
            t5t.d("ActivityTodayProfile", "getStandData: IndexOutOfBoundsException");
            return null;
        }
    }

    public final StepsData e(w2 bufDecoder) {
        try {
            int iB = w2.b(bufDecoder, 0, 1, null);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 48; i++) {
                arrayList.add(Integer.valueOf(bufDecoder.e()));
            }
            return new StepsData(iB, arrayList, w2.b(bufDecoder, 0, 1, null), w2.b(bufDecoder, 0, 1, null));
        } catch (IndexOutOfBoundsException unused) {
            t5t.d("ActivityTodayProfile", "getStepData: IndexOutOfBoundsException");
            return null;
        }
    }

    public final CalorieData a(w2 bufDecoder) {
        try {
            int iE = bufDecoder.e();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 48; i++) {
                arrayList.add(Integer.valueOf(bufDecoder.e()));
            }
            return new CalorieData(iE, arrayList, bufDecoder.e(), bufDecoder.e(), bufDecoder.e());
        } catch (IndexOutOfBoundsException unused) {
            t5t.d("ActivityTodayProfile", "getCalorieData: IndexOutOfBoundsException");
            return null;
        }
    }
}
