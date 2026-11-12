package com.huami.watch.companion.watchface.adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.bumptech.glide.signature.ObjectKey;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.lib.view.ViewUtils;
import com.huami.lib.view.quickadapter.BaseQuickAdapter;
import com.huami.lib.view.quickadapter.BaseViewHolder;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.R;
import com.huami.watch.companion.watchface.adapter.DiyTypeAdapter;
import com.huami.watch.companion.watchface.bean.Metas;
import com.huami.watch.companion.watchface.bean.WatchSkinBean;
import com.xiaomi.hm.health.imageload.GlideApp;
import com.xiaomi.hm.health.imageload.GlideRequests;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0003\u001f !B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rJ \u0010\u0012\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0018\u00010\u0003R\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0014R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\""}, d2 = {"Lcom/huami/watch/companion/watchface/adapter/DiyTypeAdapter;", "Lcom/huami/lib/view/quickadapter/BaseQuickAdapter;", "Lcom/huami/watch/companion/watchface/bean/WatchSkinBean;", "Lcom/huami/watch/companion/watchface/adapter/DiyTypeAdapter$DiyTypeAdapterHolder;", "Landroid/widget/ImageView;", "iv", "", "imageUrl", "", GoogleApiAvailabilityLight.b, "", "clickable", "setItemClickable", "Lcom/huami/watch/companion/watchface/adapter/DiyTypeAdapter$SelectDiyWatchListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addSelectDiyWatchCallback", "helper", "item", "convert", "", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, LogUtil.I, "selectedId", "B", "Lcom/huami/watch/companion/watchface/adapter/DiyTypeAdapter$SelectDiyWatchListener;", "mSelectDiyWatchCallback", "C", "Z", "itemClickable", "<init>", "(I)V", "DiyItemDecoration", "DiyTypeAdapterHolder", "SelectDiyWatchListener", "companion_release"}, k = 1, mv = {1, 5, 1})
public final class DiyTypeAdapter extends BaseQuickAdapter<WatchSkinBean, DiyTypeAdapterHolder> {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private int selectedId;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private SelectDiyWatchListener mSelectDiyWatchCallback;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private boolean itemClickable;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0002J(\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/huami/watch/companion/watchface/adapter/DiyTypeAdapter$DiyItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "", "a", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$State;", "state", "", "getItemOffsets", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "b", "F", "imageGap", "<init>", "(Landroid/content/Context;)V", "Companion", "companion_release"}, k = 1, mv = {1, 5, 1})
    public static final class DiyItemDecoration extends RecyclerView.ItemDecoration {
        public static final int GAP_COUNT = 4;
        public static final int ITEM_WIDTH_DP = 270;
        public static final int RECYCLER_PADDING = 40;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final float imageGap = ((a() - 270) - 40) / 4;

        public DiyItemDecoration(@NotNull Context context) {
            this.context = context;
        }

        private final float a() {
            Object systemService = this.context.getSystemService("window");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.widthPixels / displayMetrics.density;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            if (childAdapterPosition == 0) {
                outRect.set(0, 0, (int) ViewUtils.dp2px(this.context, this.imageGap), 0);
            } else if (childAdapterPosition == state.getItemCount() - 1) {
                outRect.set((int) ViewUtils.dp2px(this.context, this.imageGap), 0, 0, 0);
            } else {
                outRect.set((int) ViewUtils.dp2px(this.context, this.imageGap), 0, (int) ViewUtils.dp2px(this.context, this.imageGap), 0);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R%\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR%\u0010\u0011\u001a\n \u0007*\u0004\u0018\u00010\r0\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/huami/watch/companion/watchface/adapter/DiyTypeAdapter$DiyTypeAdapterHolder;", "Lcom/huami/lib/view/quickadapter/BaseViewHolder;", "", "selected", "", "setSelected", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "g", "Lkotlin/Lazy;", "getIvSelect", "()Landroid/widget/ImageView;", "ivSelect", "Landroid/view/View;", "h", "c", "()Landroid/view/View;", "viewSelect", ViewHierarchyConstants.VIEW_KEY, "<init>", "(Lcom/huami/watch/companion/watchface/adapter/DiyTypeAdapter;Landroid/view/View;)V", "companion_release"}, k = 1, mv = {1, 5, 1})
    public final class DiyTypeAdapterHolder extends BaseViewHolder {

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        private final Lazy ivSelect;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @NotNull
        private final Lazy viewSelect;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<ImageView> {
            public final /* synthetic */ View a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(View view) {
                super(0);
                this.a = view;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ImageView invoke() {
                return (ImageView) this.a.findViewById(R.id.iv_selected);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<View> {
            public final /* synthetic */ View a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(View view) {
                super(0);
                this.a = view;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final View invoke() {
                return this.a.findViewById(R.id.view_select_bg);
            }
        }

        public DiyTypeAdapterHolder(View view) {
            super(view);
            this.ivSelect = LazyKt__LazyJVMKt.lazy(new a(view));
            this.viewSelect = LazyKt__LazyJVMKt.lazy(new b(view));
        }

        private final View c() {
            return (View) this.viewSelect.getValue();
        }

        private final ImageView getIvSelect() {
            return (ImageView) this.ivSelect.getValue();
        }

        public final void setSelected(boolean selected) {
            getIvSelect().setVisibility(selected ? 0 : 8);
            c().setSelected(selected);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/watch/companion/watchface/adapter/DiyTypeAdapter$SelectDiyWatchListener;", "", "", "selectedId", "", "callback", "companion_release"}, k = 1, mv = {1, 5, 1})
    public interface SelectDiyWatchListener {
        void callback(int selectedId);
    }

    public DiyTypeAdapter(int i) {
        super(R.layout.list_item_horizontal_watch_face_diy);
        this.selectedId = i;
        this.itemClickable = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(DiyTypeAdapter diyTypeAdapter, DiyTypeAdapterHolder diyTypeAdapterHolder, View view) {
        if (diyTypeAdapter.itemClickable) {
            diyTypeAdapter.selectedId = diyTypeAdapterHolder.getLayoutPosition();
            diyTypeAdapter.notifyDataSetChanged();
            SelectDiyWatchListener selectDiyWatchListener = diyTypeAdapter.mSelectDiyWatchCallback;
            if (selectDiyWatchListener == null) {
                selectDiyWatchListener = null;
            }
            selectDiyWatchListener.callback(diyTypeAdapter.selectedId);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.xiaomi.hm.health.imageload.GlideRequest] */
    private final void n(ImageView iv, String imageUrl) {
        GlideRequests glideRequestsWith;
        if (iv == null) {
            return;
        }
        Context context = this.mContext;
        if (context instanceof Activity) {
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            glideRequestsWith = GlideApp.with((Activity) context);
        } else {
            glideRequestsWith = GlideApp.with(context);
        }
        glideRequestsWith.load(imageUrl).signature(new ObjectKey(imageUrl)).skipMemoryCache(false).placeholder(R.drawable.watch_face_list_default).optionalCircleCrop().into(iv);
    }

    public final void addSelectDiyWatchCallback(@NotNull SelectDiyWatchListener listener) {
        this.mSelectDiyWatchCallback = listener;
    }

    public final void setItemClickable(boolean clickable) {
        this.itemClickable = clickable;
    }

    @Override // com.huami.lib.view.quickadapter.BaseQuickAdapter
    public void convert(@Nullable final DiyTypeAdapterHolder helper, @Nullable WatchSkinBean item) {
        String image;
        View view;
        Metas metas;
        String transparentBg;
        if (helper != null) {
            helper.setSelected(helper.getLayoutPosition() == this.selectedId);
        }
        ImageView imageView = helper == null ? null : (ImageView) helper.getView(R.id.iv_skin);
        String str = "";
        if (item == null || (image = item.getImage()) == null) {
            image = "";
        }
        n(imageView, image);
        ImageView imageView2 = helper != null ? (ImageView) helper.getView(R.id.iv_skin_transparent) : null;
        if (item != null && (metas = item.getMetas()) != null && (transparentBg = metas.getTransparentBg()) != null) {
            str = transparentBg;
        }
        n(imageView2, str);
        if (helper == null || (view = helper.itemView) == null) {
            return;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: yb1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DiyTypeAdapter.m(this.a, helper, view2);
            }
        });
    }
}
