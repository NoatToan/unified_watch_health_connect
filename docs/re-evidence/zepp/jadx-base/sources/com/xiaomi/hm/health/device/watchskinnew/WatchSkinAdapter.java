package com.xiaomi.hm.health.device.watchskinnew;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.perf.FirebasePerformance;
import com.huami.devicex.R;
import com.huami.devicex.injection.AvatarManagerApi;
import com.huami.lib.view.ViewUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.watch_skin.WatchSkinConstant;
import com.xiaomi.hm.health.device.watch_skin.WatchSkinDetailDialog;
import com.xiaomi.hm.health.device.watch_skin.WatchSkinInfo;
import com.xiaomi.hm.health.device.watchskinnew.WatchSkinAdapter;
import com.xiaomi.hm.health.device.watchskinnew.bean.Metas;
import com.xiaomi.hm.health.device.watchskinnew.bean.WatchSkinBean;
import com.xiaomi.hm.health.device.watchskinnew.ui.DiyDialBgActivity;
import com.xiaomi.hm.health.device.watchskinnew.ui.HMDialListFragmentKt;
import com.xiaomi.hm.health.imageload.DisplayConfig;
import com.xiaomi.hm.health.imageload.HMImageLoader;
import com.xiaomi.hm.health.imageload.HMLoadTarget;
import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 42\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u00012\u00020\u0003:\u0003456B\u001f\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b2\u00103J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0014\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u001c\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016J\u001c\u0010\u0010\u001a\u00020\u00042\n\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R2\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u00070$j\b\u0012\u0004\u0012\u00020\u0007`%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001d\u00101\u001a\u00020-8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b\u0015\u00100¨\u00067"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinnew/WatchSkinAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/hm/health/device/watchskinnew/WatchSkinAdapter$WatchSkinViewHolder;", "Lorg/koin/core/component/KoinComponent;", "", "b", "", "Lcom/xiaomi/hm/health/device/watchskinnew/bean/WatchSkinBean;", "list", "addData", "Landroid/view/ViewGroup;", "p0", "", "p1", "onCreateViewHolder", "getItemCount", "onBindViewHolder", "", "show", "doAnim", "Landroidx/appcompat/app/AppCompatActivity;", "a", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "c", LogUtil.I, "type", GoogleApiAvailabilityLight.a, "animCount", "Lcom/xiaomi/hm/health/device/watchskinnew/WatchSkinAdapter$State;", "e", "Lcom/xiaomi/hm/health/device/watchskinnew/WatchSkinAdapter$State;", "mState", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "f", "Ljava/util/ArrayList;", "getData", "()Ljava/util/ArrayList;", "setData", "(Ljava/util/ArrayList;)V", "data", "Lcom/huami/devicex/injection/AvatarManagerApi;", "g", "Lkotlin/Lazy;", "()Lcom/huami/devicex/injection/AvatarManagerApi;", "avatarManagerApi", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Landroidx/recyclerview/widget/RecyclerView;I)V", "Companion", TrainingAnalytics.ParamKey.STATE, "WatchSkinViewHolder", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WatchSkinAdapter extends RecyclerView.Adapter<WatchSkinViewHolder> implements KoinComponent {
    public static final int ANIM_DURATION = 250;
    public static final float CINCO_GAP_PROPORTION = 0.5777778f;
    public static final int COLUMN_COUNT = 3;
    public static final int GAP_VERTICAL = 30;
    public static final int GAP_VERTICAL_KESTREL = 27;
    public static final int GAP_VERTICAL_VENICE = 38;
    public static final float ITEM_HEIGHT_VENICE = 179.0f;
    public static final int ITEM_WIDTH_CINCO = 60;
    public static final int ITEM_WIDTH_GT = 98;
    public static final float ITEM_WIDTH_VENICE = 58.0f;
    public static final float VENICE_GAP_PROPORTION = 0.5913978f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AppCompatActivity activity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final RecyclerView recyclerView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int animCount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private State mState = State.NORMAL;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private ArrayList<WatchSkinBean> data = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy avatarManagerApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinnew/WatchSkinAdapter$State;", "", "<init>", "(Ljava/lang/String;I)V", "NORMAL", FirebasePerformance.HttpMethod.DELETE, "NORMAL_TO_DELETE", "DELETE_TO_NORMAL", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public enum State {
        NORMAL,
        DELETE,
        NORMAL_TO_DELETE,
        DELETE_TO_NORMAL
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinnew/WatchSkinAdapter$WatchSkinViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "show", "", "playAnim", "Lcom/xiaomi/hm/health/device/watchskinnew/bean/WatchSkinBean;", "dialBean", "c", "", "position", "bind", "Landroid/widget/ImageView;", "a", "Landroid/widget/ImageView;", "thumbnailImg", "b", "deleteImg", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/hm/health/device/watchskinnew/WatchSkinAdapter;Landroid/view/View;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public final class WatchSkinViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final ImageView thumbnailImg;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final ImageView deleteImg;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[State.values().length];
                iArr[State.NORMAL.ordinal()] = 1;
                iArr[State.DELETE.ordinal()] = 2;
                iArr[State.NORMAL_TO_DELETE.ordinal()] = 3;
                iArr[State.DELETE_TO_NORMAL.ordinal()] = 4;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public WatchSkinViewHolder(View view) {
            super(view);
            ImageView imageView = (ImageView) view.findViewById(R.id.thumbnail_img);
            this.thumbnailImg = imageView;
            this.deleteImg = (ImageView) view.findViewById(R.id.delete_img);
            Pair<Float, Float> dialLayoutSize = HMDialListFragmentKt.getDialLayoutSize();
            Pair<Float, Float> watchSize = HMDialListFragmentKt.getWatchSize();
            if (dialLayoutSize.getFirst().floatValue() > 0.0f && dialLayoutSize.getSecond().floatValue() > 0.0f) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.width = (int) ViewUtils.dp2px(WatchSkinAdapter.this.activity, dialLayoutSize.getFirst().floatValue());
                layoutParams.height = (int) ViewUtils.dp2px(WatchSkinAdapter.this.activity, dialLayoutSize.getSecond().floatValue());
                Unit unit = Unit.INSTANCE;
                view.setLayoutParams(layoutParams);
            }
            if (watchSize.getFirst().floatValue() <= 0.0f || watchSize.getSecond().floatValue() <= 0.0f) {
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            layoutParams2.width = (int) ViewUtils.dp2px(WatchSkinAdapter.this.activity, watchSize.getFirst().floatValue());
            layoutParams2.height = (int) ViewUtils.dp2px(WatchSkinAdapter.this.activity, watchSize.getSecond().floatValue());
            Unit unit2 = Unit.INSTANCE;
            imageView.setLayoutParams(layoutParams2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(WatchSkinAdapter watchSkinAdapter, WatchSkinViewHolder watchSkinViewHolder, int i, View view) {
            if (watchSkinAdapter.type == 0) {
                watchSkinViewHolder.c(watchSkinAdapter.getData().get(i));
            } else {
                DiyDialBgActivity.INSTANCE.launch(watchSkinAdapter.recyclerView.getContext(), i, DialLoader.INSTANCE.getInstance().getDiyDials());
            }
        }

        private final void c(WatchSkinBean dialBean) {
            WatchSkinInfo watchSkinInfo = new WatchSkinInfo();
            watchSkinInfo.deviceType = HMDeviceType.MILI.toString();
            watchSkinInfo.downloads = dialBean.getDownloadTimes();
            watchSkinInfo.name = dialBean.getName();
            watchSkinInfo.skinBin = dialBean.getCom.huami.watch.companion.ximalaya.XimalayaConst.DOWNLOAD_URL java.lang.String();
            watchSkinInfo.skinSize = (dialBean.getSize() / 1000) + "KB";
            Metas metas = dialBean.getMetas();
            watchSkinInfo.fwVersion = metas == null ? null : metas.getMinimumFirmwareVersion();
            String[] strArr = {dialBean.getImage()};
            Unit unit = Unit.INSTANCE;
            watchSkinInfo.thumbnails = strArr;
            Integer id = dialBean.getId();
            watchSkinInfo.id = id != null ? id.intValue() : 0;
            WatchSkinDetailDialog watchSkinDetailDialog = new WatchSkinDetailDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelable(WatchSkinConstant.ARGS_SKIN_INFO, watchSkinInfo);
            watchSkinDetailDialog.setArguments(bundle);
            WatchSkinDetailDialog.SHOWING = true;
            WatchSkinAdapter.this.activity.getSupportFragmentManager().beginTransaction().add(watchSkinDetailDialog, "watchSkinDetailDialog").commitAllowingStateLoss();
        }

        private final void playAnim(boolean show) {
            ImageView imageView = this.deleteImg;
            PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[3];
            float[] fArr = new float[2];
            fArr[0] = show ? 0.0f : 1.0f;
            fArr[1] = show ? 1.0f : 0.0f;
            propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat("scaleX", fArr);
            float[] fArr2 = new float[2];
            fArr2[0] = show ? 0.0f : 1.0f;
            fArr2[1] = show ? 1.0f : 0.0f;
            propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat("scaleY", fArr2);
            float[] fArr3 = new float[2];
            fArr3[0] = show ? 0.0f : 1.0f;
            fArr3[1] = show ? 1.0f : 0.0f;
            propertyValuesHolderArr[2] = PropertyValuesHolder.ofFloat("alpha", fArr3);
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView, propertyValuesHolderArr);
            objectAnimatorOfPropertyValuesHolder.setDuration(250L);
            final WatchSkinAdapter watchSkinAdapter = WatchSkinAdapter.this;
            objectAnimatorOfPropertyValuesHolder.addListener(new AnimatorListenerAdapter() { // from class: com.xiaomi.hm.health.device.watchskinnew.WatchSkinAdapter$WatchSkinViewHolder$playAnim$1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@Nullable Animator animation) {
                    watchSkinAdapter.b();
                }
            });
            objectAnimatorOfPropertyValuesHolder.start();
        }

        public final void bind(final int position) {
            ImageView imageView = this.thumbnailImg;
            final WatchSkinAdapter watchSkinAdapter = WatchSkinAdapter.this;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: mh8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WatchSkinAdapter.WatchSkinViewHolder.b(watchSkinAdapter, this, position, view);
                }
            });
            this.thumbnailImg.setImageResource(HMDialListFragmentKt.getDefaultPlaceholder());
            DisplayConfig.ConfigBuilder configBuilderAsBitmap = HMImageLoader.with(WatchSkinAdapter.this.recyclerView.getContext()).load(WatchSkinAdapter.this.getData().get(position).getImage()).asBitmap();
            final WatchSkinAdapter watchSkinAdapter2 = WatchSkinAdapter.this;
            configBuilderAsBitmap.into(new HMLoadTarget<Bitmap>() { // from class: com.xiaomi.hm.health.device.watchskinnew.WatchSkinAdapter$WatchSkinViewHolder$bind$3
                @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
                public void onLoadFinish(@NotNull Bitmap resource) {
                    if (HMDialListFragmentKt.isRoundWatch()) {
                        watchSkinAdapter2.a().makeRoundedBitmapDrawable(resource, watchSkinAdapter2.recyclerView.getContext(), this.thumbnailImg);
                    } else {
                        this.thumbnailImg.setImageBitmap(resource);
                    }
                }
            });
            int i = WhenMappings.$EnumSwitchMapping$0[WatchSkinAdapter.this.mState.ordinal()];
            if (i == 1) {
                this.deleteImg.setVisibility(8);
                return;
            }
            if (i == 2) {
                this.deleteImg.setVisibility(0);
                return;
            }
            if (i == 3) {
                this.deleteImg.setClickable(true);
                this.deleteImg.setVisibility(0);
                playAnim(true);
            } else {
                if (i != 4) {
                    return;
                }
                this.deleteImg.setVisibility(0);
                this.deleteImg.setClickable(false);
                playAnim(false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WatchSkinAdapter(@NotNull AppCompatActivity appCompatActivity, @NotNull RecyclerView recyclerView, int i) {
        this.activity = appCompatActivity;
        this.recyclerView = recyclerView;
        this.type = i;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.avatarManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<AvatarManagerApi>() { // from class: com.xiaomi.hm.health.device.watchskinnew.WatchSkinAdapter$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.AvatarManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final AvatarManagerApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(AvatarManagerApi.class), qualifier, objArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AvatarManagerApi a() {
        return (AvatarManagerApi) this.avatarManagerApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        RecyclerView.LayoutManager layoutManager = this.recyclerView.getLayoutManager();
        Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        int iFindFirstVisibleItemPosition = gridLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = gridLayoutManager.findLastVisibleItemPosition();
        int i = this.animCount + 1;
        this.animCount = i;
        if (i >= (iFindLastVisibleItemPosition - iFindFirstVisibleItemPosition) + 1) {
            State state = this.mState;
            if (state == State.NORMAL_TO_DELETE) {
                this.mState = State.DELETE;
            } else if (state == State.DELETE_TO_NORMAL) {
                this.mState = State.NORMAL;
            }
            this.animCount = 0;
        }
    }

    public final void addData(@NotNull List<WatchSkinBean> list) {
        int size = this.data.size();
        this.data.addAll(list);
        notifyItemRangeInserted(size, list.size());
    }

    public final void doAnim(boolean show) {
        this.mState = show ? State.NORMAL_TO_DELETE : State.DELETE_TO_NORMAL;
        this.animCount = 0;
        notifyDataSetChanged();
    }

    @NotNull
    public final ArrayList<WatchSkinBean> getData() {
        return this.data;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        return this.data.size();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final void setData(@NotNull ArrayList<WatchSkinBean> arrayList) {
        this.data = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull WatchSkinViewHolder p0, int p1) {
        p0.bind(p1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public WatchSkinViewHolder onCreateViewHolder(@NotNull ViewGroup p0, int p1) {
        return new WatchSkinViewHolder(LayoutInflater.from(p0.getContext()).inflate(R.layout.watch_skin_item, p0, false));
    }
}
