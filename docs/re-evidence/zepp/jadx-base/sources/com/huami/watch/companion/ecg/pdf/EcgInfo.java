package com.huami.watch.companion.ecg.pdf;

import android.content.Context;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.ecg.core.model.FilterRecord;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.account.UserInfo;
import com.huami.watch.companion.account.UserInfoManager;
import com.huami.watch.companion.ecg.analytics.EcgAnalyticsManagerKt;
import com.huami.watch.companion.ecg.util.EcgUtils;
import com.loc.z;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\r\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\bB\u0010CR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0018\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001e\u001a\u00020\u00198F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010#\u001a\u00020\u001f8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R\u001d\u0010&\u001a\u00020\u001f8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\"R\u001d\u0010)\u001a\u00020\u001f8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001b\u001a\u0004\b(\u0010\"R\u001d\u0010.\u001a\u00020*8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u001b\u001a\u0004\b,\u0010-R\u001d\u00103\u001a\u00020/8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u001b\u001a\u0004\b1\u00102R\u001d\u00106\u001a\u00020\u001f8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\u001b\u001a\u0004\b5\u0010\"R#\u0010;\u001a\b\u0012\u0004\u0012\u00020*078F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\u001b\u001a\u0004\b9\u0010:R\u001d\u0010>\u001a\u00020/8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\u001b\u001a\u0004\b=\u00102R\u001d\u0010@\u001a\u00020\u00108F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\u001b\u001a\u0004\b@\u0010A¨\u0006D"}, d2 = {"Lcom/huami/watch/companion/ecg/pdf/EcgInfo;", "", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/ecg/core/db/entity/EcgData;", "b", "Lcom/huami/ecg/core/db/entity/EcgData;", EcgAnalyticsManagerKt.ECG, "Lcom/huami/ecg/core/model/FilterRecord;", "c", "Lcom/huami/ecg/core/model/FilterRecord;", "record", "", GoogleApiAvailabilityLight.a, "Z", "isRaw", "Lcom/huami/watch/companion/account/UserInfo;", "kotlin.jvm.PlatformType", "e", "Lcom/huami/watch/companion/account/UserInfo;", "userInfo", "", "f", "Lkotlin/Lazy;", "getName", "()Ljava/lang/String;", "name", "", "g", "getGender", "()I", "gender", "h", "getAge", "age", "i", "getHeight", "height", "", z.j, "getWeight", "()F", "weight", "", hl.k, "getTimeStamps", "()J", "timeStamps", "l", "getAvgHr", "avgHr", "", "m", "getEcgData", "()Ljava/util/List;", "ecgData", GoogleApiAvailabilityLight.b, "getRawDataLength", "rawDataLength", "o", "isOneself", "()Z", "<init>", "(Landroid/content/Context;Lcom/huami/ecg/core/db/entity/EcgData;Lcom/huami/ecg/core/model/FilterRecord;Z)V", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
public final class EcgInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final EcgData ecg;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final FilterRecord record;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isRaw;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final UserInfo userInfo;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy name;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy gender;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy age;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy height;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy weight;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy timeStamps;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Lazy avgHr;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final Lazy ecgData;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final Lazy rawDataLength;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final Lazy isOneself;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Integer> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(EcgInfo.this.userInfo.getBirthday().getAge());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Integer> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(EcgInfo.this.ecg.getEcgResultData().getHealthRecord().getHr());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010!\n\u0002\u0010\u0007\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<List<Float>> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<Float> invoke() {
            return EcgInfo.this.isRaw ? EcgInfo.this.record.getRawData() : EcgInfo.this.record.getFilter();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Integer> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(EcgInfo.this.userInfo.getGender());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Integer> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(EcgInfo.this.userInfo.getHeight());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Boolean> {
        public f() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.valueOf(EcgUtils.INSTANCE.isSelf(EcgInfo.this.ecg));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return !EcgInfo.this.isOneself() ? "--" : EcgInfo.this.userInfo.getNickname();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\t\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<Long> {
        public h() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Long invoke() {
            return Long.valueOf(EcgInfo.this.record.getFilterData().size());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\t\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<Long> {
        public i() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Long invoke() {
            return Long.valueOf(EcgInfo.this.ecg.getTimestamp());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0007\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<Float> {
        public j() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Float invoke() {
            return Float.valueOf(EcgInfo.this.userInfo.getWeight());
        }
    }

    public EcgInfo(@NotNull Context context, @NotNull EcgData ecgData, @NotNull FilterRecord filterRecord, boolean z) {
        this.context = context;
        this.ecg = ecgData;
        this.record = filterRecord;
        this.isRaw = z;
        this.userInfo = UserInfoManager.get();
        this.name = LazyKt__LazyJVMKt.lazy(new g());
        this.gender = LazyKt__LazyJVMKt.lazy(new d());
        this.age = LazyKt__LazyJVMKt.lazy(new a());
        this.height = LazyKt__LazyJVMKt.lazy(new e());
        this.weight = LazyKt__LazyJVMKt.lazy(new j());
        this.timeStamps = LazyKt__LazyJVMKt.lazy(new i());
        this.avgHr = LazyKt__LazyJVMKt.lazy(new b());
        this.ecgData = LazyKt__LazyJVMKt.lazy(new c());
        this.rawDataLength = LazyKt__LazyJVMKt.lazy(new h());
        this.isOneself = LazyKt__LazyJVMKt.lazy(new f());
    }

    public final int getAge() {
        return ((Number) this.age.getValue()).intValue();
    }

    public final int getAvgHr() {
        return ((Number) this.avgHr.getValue()).intValue();
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final List<Float> getEcgData() {
        return (List) this.ecgData.getValue();
    }

    public final int getGender() {
        return ((Number) this.gender.getValue()).intValue();
    }

    public final int getHeight() {
        return ((Number) this.height.getValue()).intValue();
    }

    @NotNull
    public final String getName() {
        return (String) this.name.getValue();
    }

    public final long getRawDataLength() {
        return ((Number) this.rawDataLength.getValue()).longValue();
    }

    public final long getTimeStamps() {
        return ((Number) this.timeStamps.getValue()).longValue();
    }

    public final float getWeight() {
        return ((Number) this.weight.getValue()).floatValue();
    }

    public final boolean isOneself() {
        return ((Boolean) this.isOneself.getValue()).booleanValue();
    }

    public /* synthetic */ EcgInfo(Context context, EcgData ecgData, FilterRecord filterRecord, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, ecgData, filterRecord, (i2 & 8) != 0 ? false : z);
    }
}
