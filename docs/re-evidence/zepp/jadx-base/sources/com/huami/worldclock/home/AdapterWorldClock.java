package com.huami.worldclock.home;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.worldclock.R;
import com.huami.worldclock.bean.AppType;
import com.huami.worldclock.bean.WorldClockBean;
import com.huami.worldclock.home.AdapterWorldClock;
import com.huami.worldclock.manager.WorldClockStrResHelper;
import com.huami.worldclock.move.OnStartDragListener;
import com.loc.z;
import com.xiaomi.hm.health.device.watchskinstore.ui.LargeWatchSkinActivity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001[B\u0007¢\u0006\u0004\bY\u0010ZJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0016\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0016\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\u001c\u0010\u0015\u001a\u00020\u00052\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0007H\u0016J\u001e\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aR\u0016\u0010\u001f\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001e\u0010$\u001a\n !*\u0004\u0018\u00010 0 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R*\u00101\u001a\u00020-2\u0006\u0010.\u001a\u00020-8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010<\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R6\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00030=2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030=8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010L\u001a\u0004\u0018\u00010E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR$\u0010T\u001a\u0004\u0018\u00010M8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010X\u001a\u0004\u0018\u00010E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010G\u001a\u0004\bV\u0010I\"\u0004\bW\u0010K¨\u0006\\"}, d2 = {"Lcom/huami/worldclock/home/AdapterWorldClock;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/worldclock/home/AdapterWorldClock$ViewHolderWorldClock;", "Lcom/huami/worldclock/bean/WorldClockBean;", LargeWatchSkinActivity.KEY_BEAN, "", "addItemWorldClock", "", "index", "addItemWorldClockIndex", "removeItem", "srcPosition", "targetPosition", "swapItem", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "onBindViewHolder", "", "pattern", "Ljava/util/Date;", "date", "Ljava/util/TimeZone;", "timeZone", "formatDate", "a", "Ljava/lang/String;", "TAG", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "b", "Ljava/util/Calendar;", "calendar", "Lcom/huami/worldclock/bean/AppType;", "c", "Lcom/huami/worldclock/bean/AppType;", "getAppType", "()Lcom/huami/worldclock/bean/AppType;", "setAppType", "(Lcom/huami/worldclock/bean/AppType;)V", "appType", "", "value", GoogleApiAvailabilityLight.a, "Z", "isEdit", "()Z", "setEdit", "(Z)V", "Lcom/huami/worldclock/move/OnStartDragListener;", "e", "Lcom/huami/worldclock/move/OnStartDragListener;", "getMDragStartListener", "()Lcom/huami/worldclock/move/OnStartDragListener;", "setMDragStartListener", "(Lcom/huami/worldclock/move/OnStartDragListener;)V", "mDragStartListener", "", "f", "Ljava/util/List;", "getWorldClocks", "()Ljava/util/List;", "setWorldClocks", "(Ljava/util/List;)V", "worldClocks", "Landroid/view/View$OnClickListener;", "g", "Landroid/view/View$OnClickListener;", "getListener", "()Landroid/view/View$OnClickListener;", "setListener", "(Landroid/view/View$OnClickListener;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/View$OnLongClickListener;", "h", "Landroid/view/View$OnLongClickListener;", "getLongClickListener", "()Landroid/view/View$OnLongClickListener;", "setLongClickListener", "(Landroid/view/View$OnLongClickListener;)V", "longClickListener", "i", "getRemoveClickListener", "setRemoveClickListener", "removeClickListener", "<init>", "()V", "ViewHolderWorldClock", "worldclock_release"}, k = 1, mv = {1, 5, 1})
public final class AdapterWorldClock extends RecyclerView.Adapter<ViewHolderWorldClock> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isEdit;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private OnStartDragListener mDragStartListener;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private View.OnClickListener listener;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private View.OnLongClickListener longClickListener;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private View.OnClickListener removeClickListener;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String TAG = AdapterWorldClock.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Calendar calendar = Calendar.getInstance();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private AppType appType = AppType.MIDONG;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private List<WorldClockBean> worldClocks = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001d\u0010\u000b\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000e\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001d\u0010\u0011\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\u0010\u0010\nR\u001d\u0010\u0014\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\nR\u001d\u0010\u0019\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\b\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001c\u001a\u00020\u00158F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\b\u001a\u0004\b\u001b\u0010\u0018R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001e¨\u0006$"}, d2 = {"Lcom/huami/worldclock/home/AdapterWorldClock$ViewHolderWorldClock;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/worldclock/bean/WorldClockBean;", LargeWatchSkinActivity.KEY_BEAN, "", "bindData", "Landroid/widget/TextView;", "a", "Lkotlin/Lazy;", "g", "()Landroid/widget/TextView;", "city", "b", z.j, "jetLag", "c", "i", "hourMinute", GoogleApiAvailabilityLight.a, hl.k, "mouthDay", "Landroid/widget/ImageButton;", "e", "h", "()Landroid/widget/ImageButton;", "delete", "f", "getDrag", "drag", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/view/View;", "itemView", "<init>", "(Lcom/huami/worldclock/home/AdapterWorldClock;Landroid/view/View;)V", "worldclock_release"}, k = 1, mv = {1, 5, 1})
    public final class ViewHolderWorldClock extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Lazy city;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final Lazy jetLag;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final Lazy hourMinute;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private final Lazy mouthDay;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        private final Lazy delete;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        private final Lazy drag;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        private Context context;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<TextView> {
            public final /* synthetic */ View a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(View view) {
                super(0);
                this.a = view;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TextView invoke() {
                return (TextView) this.a.findViewById(R.id.world_clock_city);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/ImageButton;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<ImageButton> {
            public final /* synthetic */ View a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(View view) {
                super(0);
                this.a = view;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ImageButton invoke() {
                return (ImageButton) this.a.findViewById(R.id.world_clock_delete);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/ImageButton;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<ImageButton> {
            public final /* synthetic */ View a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(View view) {
                super(0);
                this.a = view;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ImageButton invoke() {
                return (ImageButton) this.a.findViewById(R.id.drag_button);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function0<TextView> {
            public final /* synthetic */ View a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(View view) {
                super(0);
                this.a = view;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TextView invoke() {
                return (TextView) this.a.findViewById(R.id.world_clock_time_hourMinute);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function0<TextView> {
            public final /* synthetic */ View a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(View view) {
                super(0);
                this.a = view;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TextView invoke() {
                return (TextView) this.a.findViewById(R.id.jet_lag);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f extends Lambda implements Function0<TextView> {
            public final /* synthetic */ View a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(View view) {
                super(0);
                this.a = view;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TextView invoke() {
                return (TextView) this.a.findViewById(R.id.world_clock_mouthDay);
            }
        }

        public ViewHolderWorldClock(View view) {
            super(view);
            this.city = LazyKt__LazyJVMKt.lazy(new a(view));
            this.jetLag = LazyKt__LazyJVMKt.lazy(new e(view));
            this.hourMinute = LazyKt__LazyJVMKt.lazy(new d(view));
            this.mouthDay = LazyKt__LazyJVMKt.lazy(new f(view));
            this.delete = LazyKt__LazyJVMKt.lazy(new b(view));
            this.drag = LazyKt__LazyJVMKt.lazy(new c(view));
            this.context = view.getContext();
            view.setOnClickListener(new View.OnClickListener() { // from class: j7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AdapterWorldClock.ViewHolderWorldClock.d(adapterWorldClock, view2);
                }
            });
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: k7
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    return AdapterWorldClock.ViewHolderWorldClock.e(adapterWorldClock, view2);
                }
            });
            h().setOnClickListener(new View.OnClickListener() { // from class: i7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AdapterWorldClock.ViewHolderWorldClock.f(adapterWorldClock, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(AdapterWorldClock adapterWorldClock, View view) {
            View.OnClickListener listener = adapterWorldClock.getListener();
            if (listener == null) {
                return;
            }
            listener.onClick(view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean e(AdapterWorldClock adapterWorldClock, View view) {
            View.OnLongClickListener longClickListener = adapterWorldClock.getLongClickListener();
            if (longClickListener == null) {
                return false;
            }
            return longClickListener.onLongClick(view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(AdapterWorldClock adapterWorldClock, View view) {
            View.OnClickListener removeClickListener = adapterWorldClock.getRemoveClickListener();
            if (removeClickListener == null) {
                return;
            }
            removeClickListener.onClick(view);
        }

        private final TextView g() {
            return (TextView) this.city.getValue();
        }

        private final ImageButton h() {
            return (ImageButton) this.delete.getValue();
        }

        private final TextView i() {
            return (TextView) this.hourMinute.getValue();
        }

        private final TextView j() {
            return (TextView) this.jetLag.getValue();
        }

        private final TextView k() {
            return (TextView) this.mouthDay.getValue();
        }

        public final void bindData(@NotNull WorldClockBean bean) {
            int i;
            this.itemView.setTag(bean);
            this.itemView.setLongClickable(!AdapterWorldClock.this.getIsEdit());
            Context context = this.context;
            if (context != null) {
                AdapterWorldClock adapterWorldClock = AdapterWorldClock.this;
                TimeZone timeZone = TimeZone.getTimeZone(bean.getIdentifier());
                WorldClockStrResHelper worldClockStrResHelper = WorldClockStrResHelper.INSTANCE;
                int city = worldClockStrResHelper.getCity(context, bean);
                g().setText(city == 0 ? "" : context.getString(city));
                j().setText(worldClockStrResHelper.calculateTimeZoneWithLocale(context, timeZone, TimeZone.getDefault()));
                adapterWorldClock.calendar.setTimeZone(timeZone);
                adapterWorldClock.calendar.setTime(new Date());
                k().setText(adapterWorldClock.formatDate(DateFormat.getBestDateTimePattern(Locale.getDefault(), context.getString(R.string.world_clock_date_format_mouth_day)), adapterWorldClock.calendar.getTime(), timeZone));
                boolean zIs24HourFormat = DateFormat.is24HourFormat(this.context);
                if (zIs24HourFormat) {
                    i = R.string.world_clock_date_format_minute_hour;
                } else {
                    if (zIs24HourFormat) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R.string.world_clock_date_format_minute_hour_12;
                }
                i().setText(adapterWorldClock.formatDate(DateFormat.getBestDateTimePattern(Locale.getDefault(), context.getString(i)), adapterWorldClock.calendar.getTime(), timeZone));
            }
            k().setVisibility(!AdapterWorldClock.this.getIsEdit() ? 0 : 8);
            i().setVisibility(!AdapterWorldClock.this.getIsEdit() ? 0 : 8);
            h().setVisibility(AdapterWorldClock.this.getIsEdit() ? 0 : 8);
            getDrag().setVisibility(AdapterWorldClock.this.getIsEdit() ? 0 : 8);
            h().setTag(bean);
        }

        @NotNull
        public final ImageButton getDrag() {
            return (ImageButton) this.drag.getValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppType.values().length];
            iArr[AppType.MIDONG.ordinal()] = 1;
            iArr[AppType.MIFIT.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(AdapterWorldClock adapterWorldClock, ViewHolderWorldClock viewHolderWorldClock, View view) {
        OnStartDragListener mDragStartListener = adapterWorldClock.getMDragStartListener();
        if (mDragStartListener == null) {
            return true;
        }
        mDragStartListener.onStartDrag(viewHolderWorldClock);
        return true;
    }

    public final void addItemWorldClock(@NotNull WorldClockBean bean) {
        this.worldClocks.add(bean);
        notifyDataSetChanged();
    }

    public final void addItemWorldClockIndex(@NotNull WorldClockBean bean, int index) {
        this.worldClocks.add(index, bean);
        notifyDataSetChanged();
    }

    @NotNull
    public final String formatDate(@NotNull String pattern, @NotNull Date date, @NotNull TimeZone timeZone) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, Locale.getDefault());
            simpleDateFormat.setTimeZone(timeZone);
            return simpleDateFormat.format(date);
        } catch (Exception e) {
            HMLog.w(this.TAG, ((Object) e.getMessage()) + "\nlocale:" + Locale.getDefault() + "\ntimezone:" + ((Object) timeZone.getID()) + "\npattern:" + pattern, new Object[0]);
            return "";
        }
    }

    @NotNull
    public final AppType getAppType() {
        return this.appType;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getFragmentsCount() {
        return this.worldClocks.size();
    }

    @Nullable
    public final View.OnClickListener getListener() {
        return this.listener;
    }

    @Nullable
    public final View.OnLongClickListener getLongClickListener() {
        return this.longClickListener;
    }

    @Nullable
    public final OnStartDragListener getMDragStartListener() {
        return this.mDragStartListener;
    }

    @Nullable
    public final View.OnClickListener getRemoveClickListener() {
        return this.removeClickListener;
    }

    @NotNull
    public final List<WorldClockBean> getWorldClocks() {
        return this.worldClocks;
    }

    /* JADX INFO: renamed from: isEdit, reason: from getter */
    public final boolean getIsEdit() {
        return this.isEdit;
    }

    public final void removeItem(@NotNull WorldClockBean bean) {
        int iIndexOf = this.worldClocks.indexOf(bean);
        if (iIndexOf != -1) {
            this.worldClocks.remove(iIndexOf);
            notifyItemRemoved(iIndexOf);
        }
    }

    public final void setAppType(@NotNull AppType appType) {
        this.appType = appType;
    }

    public final void setEdit(boolean z) {
        this.isEdit = z;
        notifyDataSetChanged();
    }

    public final void setListener(@Nullable View.OnClickListener onClickListener) {
        this.listener = onClickListener;
    }

    public final void setLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.longClickListener = onLongClickListener;
    }

    public final void setMDragStartListener(@Nullable OnStartDragListener onStartDragListener) {
        this.mDragStartListener = onStartDragListener;
    }

    public final void setRemoveClickListener(@Nullable View.OnClickListener onClickListener) {
        this.removeClickListener = onClickListener;
    }

    public final void setWorldClocks(@NotNull List<WorldClockBean> list) {
        this.worldClocks.clear();
        this.worldClocks.addAll(list);
        notifyDataSetChanged();
    }

    public final void swapItem(int srcPosition, int targetPosition) {
        if (srcPosition >= this.worldClocks.size() || targetPosition >= this.worldClocks.size()) {
            return;
        }
        Collections.swap(this.worldClocks, srcPosition, targetPosition);
        notifyItemMoved(srcPosition, targetPosition);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull final ViewHolderWorldClock holder, int position) {
        holder.bindData(this.worldClocks.get(position));
        holder.getDrag().setOnLongClickListener(new View.OnLongClickListener() { // from class: h7
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return AdapterWorldClock.b(this.a, holder, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolderWorldClock onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()];
        int i2 = (i == 1 || i != 2) ? R.layout.item_world_clock : R.layout.item_world_clock_mi;
        return new ViewHolderWorldClock(LayoutInflater.from(parent.getContext()).inflate(i2, parent, false));
    }
}
