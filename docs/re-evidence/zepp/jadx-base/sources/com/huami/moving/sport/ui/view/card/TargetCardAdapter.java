package com.huami.moving.sport.ui.view.card;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.sportlib.utils.RunDataConversion;
import com.huami.moving.R;
import com.huami.moving.ui.utils.DataFormatter;
import com.huami.tools.analytics.DbUtils;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import com.huami.watch.notification.TransportUri;
import com.loc.z;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010!\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003STUB'\u0012\u0006\u00102\u001a\u000200\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u00105\u001a\u00020$¢\u0006\u0004\bQ\u0010RJ-\u0010\b\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000b\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000e\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\r2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0019\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\rH\u0002J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u001a\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0 0\u001fH\u0002J \u0010&\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u00032\u0006\u0010%\u001a\u00020$H\u0002J\u0018\u0010*\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u0003H\u0016J\b\u0010+\u001a\u00020\u0003H\u0016J\u0018\u0010/\u001a\u00020.2\u0006\u0010,\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u0003H\u0016R\u0016\u00102\u001a\u0002008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00101R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00103R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00104R\u0016\u00105\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00104R\u001d\u00109\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u00106\u001a\u0004\b7\u00108R\u001d\u0010;\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u00106\u001a\u0004\b:\u00108R\u001d\u0010=\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u00106\u001a\u0004\b<\u00108R\u001d\u0010?\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u00106\u001a\u0004\b>\u00108R\u001d\u0010A\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u00106\u001a\u0004\b@\u00108R\u001d\u0010C\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u00106\u001a\u0004\bB\u00108R\u001d\u0010E\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u00106\u001a\u0004\bD\u00108R\u001d\u0010G\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00106\u001a\u0004\bF\u00108R\u001d\u0010I\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u00106\u001a\u0004\bH\u00108R\u001d\u0010K\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u00106\u001a\u0004\bJ\u00108R\u001d\u0010M\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u00106\u001a\u0004\bL\u00108R(\u0010P\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0 0N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010O¨\u0006V"}, d2 = {"Lcom/huami/moving/sport/ui/view/card/TargetCardAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "value", "Lkotlin/Function1;", "", TransportUri.ACTION_BLOCK, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "(Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "Landroid/text/SpannableString;", "y", "(Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)Landroid/text/SpannableString;", "", "z", "(Ljava/lang/Float;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "record", "a", "b", "i", z.j, "percent", "f", "(Ljava/lang/Float;)Ljava/lang/String;", "e", "g", "h", hl.k, GoogleApiAvailabilityLight.a, "c", "", "Lkotlin/Pair;", "x", "distance", "sportType", "", TdmillHmFragment.ARG_IS_METRIC, "m", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "Z", "isSportEndPage", "Lkotlin/Lazy;", "l", "()Ljava/lang/String;", "defaultValue", "v", "targetPercent", "w", "targetTime", DTransferConstants.SEARCH_KEY, "targetDistance", "o", "targetConsume", "u", "targetPace", GoogleApiAvailabilityLight.b, "targetComplete", "t", "targetLap", com.google.android.exoplayer2.text.ttml.b.r, "targetCount", "r", "targetEffectAerobic", SOAP.XMLNS, "targetEffectAnaerobic", "", "Ljava/util/List;", "data", "<init>", "(Landroid/content/Context;Lcom/xiaomi/hm/health/databases/model/Trackrecord;ZZ)V", "TargetType", "ViewHolderCardInfo", "ViewHolderCardInfoEndPage", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
public final class TargetCardAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Trackrecord record;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isMetric;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isSportEndPage;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy defaultValue = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy targetPercent = LazyKt__LazyJVMKt.lazy(new s());

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy targetTime = LazyKt__LazyJVMKt.lazy(new t());

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy targetDistance = LazyKt__LazyJVMKt.lazy(new n());

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy targetConsume = LazyKt__LazyJVMKt.lazy(new l());

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy targetPace = LazyKt__LazyJVMKt.lazy(new r());

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy targetComplete = LazyKt__LazyJVMKt.lazy(new k());

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Lazy targetLap = LazyKt__LazyJVMKt.lazy(new q());

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final Lazy targetCount = LazyKt__LazyJVMKt.lazy(new m());

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final Lazy targetEffectAerobic = LazyKt__LazyJVMKt.lazy(new o());

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final Lazy targetEffectAnaerobic = LazyKt__LazyJVMKt.lazy(new p());

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private List<Pair<String, SpannableString>> data;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/huami/moving/sport/ui/view/card/TargetCardAdapter$TargetType;", "", "<init>", "(Ljava/lang/String;I)V", "TARGET_NONE", "TARGET_PACE", "TARGET_TIME", "TARGET_DISTANCE", "TARGET_CONSUME", "TARGET_LAP", "TARGET_COUNT", "TARGET_EFFECT_AEROBIC", "TARGET_EFFECT_ANAEROBIC", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
    public enum TargetType {
        TARGET_NONE,
        TARGET_PACE,
        TARGET_TIME,
        TARGET_DISTANCE,
        TARGET_CONSUME,
        TARGET_LAP,
        TARGET_COUNT,
        TARGET_EFFECT_AEROBIC,
        TARGET_EFFECT_ANAEROBIC
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/huami/moving/sport/ui/view/card/TargetCardAdapter$ViewHolderCardInfo;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lkotlin/Pair;", "", "Landroid/text/SpannableString;", "item", "", "bindData", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "content", "b", "desc", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class ViewHolderCardInfo extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final TextView content;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final TextView desc;

        public ViewHolderCardInfo(@NotNull View view) {
            super(view);
            this.content = (TextView) view.findViewById(R.id.over_view_item_content_target);
            this.desc = (TextView) view.findViewById(R.id.over_view_item_desc_target);
        }

        public final void bindData(@NotNull Pair<String, ? extends SpannableString> item) {
            this.content.setText(item.getSecond());
            this.desc.setText(item.getFirst());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/huami/moving/sport/ui/view/card/TargetCardAdapter$ViewHolderCardInfoEndPage;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lkotlin/Pair;", "", "Landroid/text/SpannableString;", "item", "", "bindData", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "content", "b", "desc", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class ViewHolderCardInfoEndPage extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final TextView content;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final TextView desc;

        public ViewHolderCardInfoEndPage(@NotNull View view) {
            super(view);
            this.content = (TextView) view.findViewById(R.id.over_view_item_content_target);
            this.desc = (TextView) view.findViewById(R.id.over_view_item_desc_target);
        }

        public final void bindData(@NotNull Pair<String, ? extends SpannableString> item) {
            this.content.setText(item.getSecond());
            this.desc.setText(item.getFirst());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return TargetCardAdapter.this.context.getString(R.string.running_pace_empty);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Float, String> {
        public b() {
            super(1);
        }

        @NotNull
        public final String a(float f) {
            return DataFormatter.formatTimeInSportFormForPace((long) RunDataConversion.paceMultiplyKilo(f, TargetCardAdapter.this.isMetric));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Float f) {
            return a(f.floatValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Integer, String> {
        public c() {
            super(1);
        }

        @NotNull
        public final String a(int i) {
            return DataFormatter.formatTimeInSportFormForPace((long) RunDataConversion.paceMultiplyKilo(i / 1000.0f, TargetCardAdapter.this.isMetric));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class d extends FunctionReferenceImpl implements Function1<Integer, String> {
        public static final d a = new d();

        public d() {
            super(1, Integer.TYPE, "toString", "toString()Ljava/lang/String;", 0);
        }

        @NotNull
        public final String a(int i) {
            return String.valueOf(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class e extends FunctionReferenceImpl implements Function1<Integer, String> {
        public static final e a = new e();

        public e() {
            super(1, Integer.TYPE, "toString", "toString()Ljava/lang/String;", 0);
        }

        @NotNull
        public final String a(int i) {
            return String.valueOf(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "Landroid/text/SpannableString;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<Integer, SpannableString> {
        public final /* synthetic */ Trackrecord b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Trackrecord trackrecord) {
            super(1);
            this.b = trackrecord;
        }

        @NotNull
        public final SpannableString a(int i) {
            return TargetCardAdapter.this.m(i, this.b.getType().intValue(), TargetCardAdapter.this.isMetric);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ SpannableString invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "Landroid/text/SpannableString;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<Integer, SpannableString> {
        public final /* synthetic */ Trackrecord b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Trackrecord trackrecord) {
            super(1);
            this.b = trackrecord;
        }

        @NotNull
        public final SpannableString a(int i) {
            return TargetCardAdapter.this.m(i, this.b.getType().intValue(), TargetCardAdapter.this.isMetric);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ SpannableString invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function1<Integer, String> {
        public static final h a = new h();

        public h() {
            super(1);
        }

        @NotNull
        public final String a(int i) {
            return DataFormatter.getConsumeTime(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function1<Integer, String> {
        public static final i a = new i();

        public i() {
            super(1);
        }

        @NotNull
        public final String a(int i) {
            return DataFormatter.getConsumeTime(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function1<Integer, String> {
        public static final j a = new j();

        public j() {
            super(1);
        }

        @NotNull
        public final String a(int i) {
            return String.valueOf(i / 10.0f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return TargetCardAdapter.this.context.getString(R.string.sport_detail_target_complete);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return TargetCardAdapter.this.context.getString(R.string.sport_detail_target_type_consume);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return TargetCardAdapter.this.context.getString(R.string.sport_detail_target_type_count);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return TargetCardAdapter.this.context.getString(R.string.sport_detail_target_type_distance);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return TargetCardAdapter.this.context.getString(R.string.sport_detail_target_type_effect_aerobic);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<String> {
        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return TargetCardAdapter.this.context.getString(R.string.sport_detail_target_type_effect_anaerobic);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<String> {
        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return TargetCardAdapter.this.context.getString(R.string.sport_detail_target_type_lap);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<String> {
        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return TargetCardAdapter.this.context.getString(R.string.sport_detail_target_type_pace);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function0<String> {
        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return TargetCardAdapter.this.context.getString(R.string.sport_detail_target_percent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t extends Lambda implements Function0<String> {
        public t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return TargetCardAdapter.this.context.getString(R.string.sport_detail_target_type_time);
        }
    }

    public TargetCardAdapter(@NotNull Context context, @NotNull Trackrecord trackrecord, boolean z, boolean z2) {
        this.context = context;
        this.record = trackrecord;
        this.isMetric = z;
        this.isSportEndPage = z2;
        this.data = new ArrayList();
        this.data = CollectionsKt___CollectionsKt.toMutableList((Collection) x());
    }

    private final String A(Integer value, Function1<? super Integer, String> block) {
        String strInvoke = null;
        if (value != null) {
            if (!(value.intValue() > 0)) {
                value = null;
            }
            if (value != null) {
                strInvoke = block.invoke(value);
            }
        }
        return strInvoke == null ? l() : strInvoke;
    }

    private final String a(Trackrecord record) {
        return z(record.getPace(), new b());
    }

    private final String b(Trackrecord record) {
        return A(Integer.valueOf(record.getTargetValue()), new c());
    }

    private final String c(Trackrecord record) {
        return A(Integer.valueOf(record.getTargetValue()), d.a);
    }

    private final String d(int value) {
        return A(Integer.valueOf(value), e.a);
    }

    private final String e(float percent) {
        return ((int) percent) + "%";
    }

    private final String f(Float percent) {
        String str = null;
        if (percent != null) {
            if (!(percent.floatValue() >= 0.0f)) {
                percent = null;
            }
            if (percent != null) {
                str = ((int) percent.floatValue()) + "%";
            }
        }
        return str == null ? l() : str;
    }

    private final SpannableString g(Trackrecord record) {
        return y(record.getDistance(), new f(record));
    }

    private final SpannableString h(Trackrecord record) {
        return y(Integer.valueOf(record.getTargetValue()), new g(record));
    }

    private final String i(Trackrecord record) {
        return A(record.getCosttime(), h.a);
    }

    private final String j(Trackrecord record) {
        return A(Integer.valueOf(record.getTargetValue()), i.a);
    }

    private final String k(int value) {
        return A(Integer.valueOf(value), j.a);
    }

    private final String l() {
        return (String) this.defaultValue.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SpannableString m(float distance, int sportType, boolean isMetric) {
        String[] formatDisAndUnit = DataFormatter.getFormatDisAndUnit(distance, sportType, isMetric, false);
        int i2 = Integer.parseInt(formatDisAndUnit[1]);
        String str = formatDisAndUnit[0] + this.context.getString(i2);
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new RelativeSizeSpan(0.6f), formatDisAndUnit[0].length(), str.length(), 17);
        return spannableString;
    }

    private final String n() {
        return (String) this.targetComplete.getValue();
    }

    private final String o() {
        return (String) this.targetConsume.getValue();
    }

    private final String p() {
        return (String) this.targetCount.getValue();
    }

    private final String q() {
        return (String) this.targetDistance.getValue();
    }

    private final String r() {
        return (String) this.targetEffectAerobic.getValue();
    }

    private final String s() {
        return (String) this.targetEffectAnaerobic.getValue();
    }

    private final String t() {
        return (String) this.targetLap.getValue();
    }

    private final String u() {
        return (String) this.targetPace.getValue();
    }

    private final String v() {
        return (String) this.targetPercent.getValue();
    }

    private final String w() {
        return (String) this.targetTime.getValue();
    }

    private final List<Pair<String, SpannableString>> x() {
        int targetType = this.record.getTargetType();
        if (targetType == TargetType.TARGET_PACE.ordinal()) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(u(), new SpannableString(b(this.record))), TuplesKt.to(n(), new SpannableString(a(this.record)))});
        }
        if (targetType == TargetType.TARGET_TIME.ordinal()) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(w(), new SpannableString(j(this.record))), TuplesKt.to(n(), new SpannableString(i(this.record))), TuplesKt.to(v(), new SpannableString(f(Float.valueOf((this.record.getCosttime().intValue() * 100.0f) / this.record.getTargetValue()))))});
        }
        if (targetType == TargetType.TARGET_DISTANCE.ordinal()) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(q(), h(this.record)), TuplesKt.to(n(), g(this.record)), TuplesKt.to(v(), new SpannableString(e((this.record.getDistance().intValue() * 100.0f) / this.record.getTargetValue())))});
        }
        if (targetType == TargetType.TARGET_CONSUME.ordinal()) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(o(), new SpannableString(c(this.record))), TuplesKt.to(n(), new SpannableString(d(this.record.getCal().intValue()))), TuplesKt.to(v(), new SpannableString(f(Float.valueOf((this.record.getCal().intValue() * 100.0f) / this.record.getTargetValue()))))});
        }
        if (targetType == TargetType.TARGET_LAP.ordinal()) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(t(), new SpannableString(c(this.record))), TuplesKt.to(n(), new SpannableString(d(this.record.getSwimTurns().intValue()))), TuplesKt.to(v(), new SpannableString(f(Float.valueOf((this.record.getSwimTurns().intValue() * 100.0f) / this.record.getTargetValue()))))});
        }
        if (targetType == TargetType.TARGET_COUNT.ordinal()) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(p(), new SpannableString(c(this.record))), TuplesKt.to(n(), new SpannableString(d(this.record.getTouchStrokes()))), TuplesKt.to(v(), new SpannableString(f(Float.valueOf((this.record.getTouchStrokes() * 100.0f) / this.record.getTargetValue()))))});
        }
        if (targetType == TargetType.TARGET_EFFECT_AEROBIC.ordinal()) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(r(), new SpannableString(k(this.record.getTargetValue()))), TuplesKt.to(n(), new SpannableString(k(this.record.getTeValue().intValue()))), TuplesKt.to(v(), new SpannableString(f(Float.valueOf((this.record.getTeValue().intValue() * 100.0f) / this.record.getTargetValue()))))});
        }
        return targetType == TargetType.TARGET_EFFECT_ANAEROBIC.ordinal() ? CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(s(), new SpannableString(k(this.record.getTargetValue()))), TuplesKt.to(n(), new SpannableString(k(this.record.getTeAnaerobicValue().intValue()))), TuplesKt.to(v(), new SpannableString(f(Float.valueOf((this.record.getTeAnaerobicValue().intValue() * 100.0f) / this.record.getTargetValue()))))}) : CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(u(), new SpannableString(b(this.record))), TuplesKt.to(n(), new SpannableString(a(this.record)))});
    }

    private final SpannableString y(Integer value, Function1<? super Integer, ? extends SpannableString> block) {
        SpannableString spannableStringInvoke = null;
        if (value != null) {
            if (!(value.intValue() >= 0)) {
                value = null;
            }
            if (value != null) {
                spannableStringInvoke = block.invoke(value);
            }
        }
        return spannableStringInvoke == null ? new SpannableString(l()) : spannableStringInvoke;
    }

    private final String z(Float value, Function1<? super Float, String> block) {
        String strInvoke = null;
        if (value != null) {
            if (!(value.floatValue() > 0.0f)) {
                value = null;
            }
            if (value != null) {
                strInvoke = block.invoke(value);
            }
        }
        return strInvoke == null ? l() : strInvoke;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getFragmentsCount() {
        return this.data.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ViewHolderCardInfo) {
            ((ViewHolderCardInfo) holder).bindData(this.data.get(position));
        } else if (holder instanceof ViewHolderCardInfoEndPage) {
            ((ViewHolderCardInfoEndPage) holder).bindData(this.data.get(position));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return this.isSportEndPage ? new ViewHolderCardInfoEndPage(LayoutInflater.from(this.context).inflate(R.layout.item_target_sport_end_over_view, parent, false)) : new ViewHolderCardInfo(LayoutInflater.from(this.context).inflate(R.layout.item_target_over_view, parent, false));
    }
}
