package com.xiaomi.fitness.watch.face.adapter;

import android.content.Context;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.miui.tsmclient.database.DatabaseConstants;
import com.xiaomi.fitness.watch.face.adapter.FaceStyleAdapter;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import com.xiaomi.fitness.watch.face.export.exportview.FaceIcon;
import com.xiaomi.fitness.watch.face.export.exportview.FaceInfoView;
import defpackage.isi;
import defpackage.ovi;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u00012\u00020\u0003:\u0001LB1\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u001c\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\f\u00107\u001a\b\u0012\u0004\u0012\u00020!08J\u001c\u0010:\u001a\u00060\u0002R\u00020\u00002\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0016J\b\u0010?\u001a\u00020>H\u0016J\u001c\u0010@\u001a\u0002042\n\u0010A\u001a\u00060\u0002R\u00020\u00002\u0006\u0010B\u001a\u00020>H\u0016J\u0010\u0010C\u001a\u0002042\u0006\u0010D\u001a\u00020EH\u0016J*\u0010F\u001a\u0002042\b\u0010G\u001a\u0004\u0018\u00010\n2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020&2\u0006\u0010K\u001a\u00020&H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R#\u0010\u0018\u001a\n \u001a*\u0004\u0018\u00010\u00190\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020+X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00100\u001a\u00020+X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R\u000e\u00109\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006M"}, d2 = {"Lcom/xiaomi/fitness/watch/face/adapter/FaceStyleAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/watch/face/adapter/FaceStyleAdapter$Holder;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "data", "", "Landroid/os/Parcelable;", "curUrl", "", "bg", "<init>", "(Landroid/content/Context;[Landroid/os/Parcelable;Ljava/lang/String;Ljava/lang/String;)V", "getContext", "()Landroid/content/Context;", "getData", "()[Landroid/os/Parcelable;", "[Landroid/os/Parcelable;", "getCurUrl", "()Ljava/lang/String;", "setCurUrl", "(Ljava/lang/String;)V", "getBg", "mInflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "getMInflater", "()Landroid/view/LayoutInflater;", "mInflater$delegate", "Lkotlin/Lazy;", "liveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData$BgStyle;", "getLiveData", "()Landroidx/lifecycle/MutableLiveData;", "liveData$delegate", "isMultiPhotos", "", "()Z", "setMultiPhotos", "(Z)V", "mImageView", "Lcom/xiaomi/fitness/watch/face/export/exportview/FaceInfoView;", "getMImageView", "()Lcom/xiaomi/fitness/watch/face/export/exportview/FaceInfoView;", "setMImageView", "(Lcom/xiaomi/fitness/watch/face/export/exportview/FaceInfoView;)V", "bgView", "getBgView", "setBgView", "observeStyle", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "cached", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemCount", "onBindViewHolder", "holder", "position", "onClick", "v", "Landroid/view/View;", "loadFaceIcon", "url", "imgView", "Lcom/xiaomi/fitness/watch/face/export/exportview/FaceIcon;", "isCurrent", DatabaseConstants.TABLE_CACHE, "Holder", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFaceStyleAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceStyleAdapter.kt\ncom/xiaomi/fitness/watch/face/adapter/FaceStyleAdapter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,86:1\n1682#2,6:87\n1682#2,6:93\n*S KotlinDebug\n*F\n+ 1 FaceStyleAdapter.kt\ncom/xiaomi/fitness/watch/face/adapter/FaceStyleAdapter\n*L\n66#1:87,6\n68#1:93,6\n*E\n"})
public final class FaceStyleAdapter extends RecyclerView.Adapter<Holder> implements View.OnClickListener {

    @Nullable
    private final String bg;
    public FaceInfoView bgView;
    private boolean cached;

    @NotNull
    private final Context context;

    @Nullable
    private String curUrl;

    @NotNull
    private final Parcelable[] data;
    private boolean isMultiPhotos;

    /* JADX INFO: renamed from: liveData$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy liveData;
    public FaceInfoView mImageView;

    /* JADX INFO: renamed from: mInflater$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mInflater;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/watch/face/adapter/FaceStyleAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "position", "", "bindView", "(I)V", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "<init>", "(Lcom/xiaomi/fitness/watch/face/adapter/FaceStyleAdapter;Landroid/view/View;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class Holder extends RecyclerView.d0 {
        final /* synthetic */ FaceStyleAdapter this$0;

        @NotNull
        private final View view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Holder(@NotNull FaceStyleAdapter faceStyleAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = faceStyleAdapter;
            this.view = view;
        }

        public final void bindView(int position) {
            Parcelable parcelable = this.this$0.getData()[position];
            Intrinsics.checkNotNull(parcelable, "null cannot be cast to non-null type com.xiaomi.fitness.watch.face.export.data.FaceData.BgStyle");
            FaceData.BgStyle bgStyle = (FaceData.BgStyle) parcelable;
            FaceStyleAdapter faceStyleAdapter = this.this$0;
            String style = bgStyle.getStyle();
            View viewFindViewById = this.view.findViewById(isi.T0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            faceStyleAdapter.loadFaceIcon(style, (FaceIcon) viewFindViewById, Intrinsics.areEqual(bgStyle.getStyle(), this.this$0.getCurUrl()), false);
            FaceStyleAdapter faceStyleAdapter2 = this.this$0;
            String bg = faceStyleAdapter2.getBg();
            View viewFindViewById2 = this.view.findViewById(isi.q);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            faceStyleAdapter2.loadFaceIcon(bg, (FaceIcon) viewFindViewById2, Intrinsics.areEqual(bgStyle.getStyle(), this.this$0.getCurUrl()), false);
            this.view.setTag(bgStyle);
        }

        @NotNull
        public final View getView() {
            return this.view;
        }
    }

    public FaceStyleAdapter(@NotNull Context context, @NotNull Parcelable[] data, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        this.context = context;
        this.data = data;
        this.curUrl = str;
        this.bg = str2;
        this.mInflater = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: q59
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceStyleAdapter.mInflater_delegate$lambda$0(this.f31130a);
            }
        });
        this.liveData = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: r59
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceStyleAdapter.liveData_delegate$lambda$1();
            }
        });
    }

    private final LayoutInflater getMInflater() {
        return (LayoutInflater) this.mInflater.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData liveData_delegate$lambda$1() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadFaceIcon(String url, FaceIcon imgView, boolean isCurrent, boolean cache) {
        if (cache) {
            FaceManager.INSTANCE.loadFaceUrl(url, imgView, (4092 & 4) != 0 ? false : isCurrent, (4092 & 8) != 0 ? false : true, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : true, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
        } else if (TextUtils.isEmpty(url)) {
            imgView.setImageResource(0);
        } else {
            FaceManager.INSTANCE.loadFaceUrl(url, imgView, (4092 & 4) != 0 ? false : isCurrent, (4092 & 8) != 0 ? false : true, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutInflater mInflater_delegate$lambda$0(FaceStyleAdapter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return LayoutInflater.from(this$0.context);
    }

    @Nullable
    public final String getBg() {
        return this.bg;
    }

    @NotNull
    public final FaceInfoView getBgView() {
        FaceInfoView faceInfoView = this.bgView;
        if (faceInfoView != null) {
            return faceInfoView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bgView");
        return null;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Nullable
    public final String getCurUrl() {
        return this.curUrl;
    }

    @NotNull
    public final Parcelable[] getData() {
        return this.data;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.data.length;
    }

    @NotNull
    public final MutableLiveData<FaceData.BgStyle> getLiveData() {
        return (MutableLiveData) this.liveData.getValue();
    }

    @NotNull
    public final FaceInfoView getMImageView() {
        FaceInfoView faceInfoView = this.mImageView;
        if (faceInfoView != null) {
            return faceInfoView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mImageView");
        return null;
    }

    /* JADX INFO: renamed from: isMultiPhotos, reason: from getter */
    public final boolean getIsMultiPhotos() {
        return this.isMultiPhotos;
    }

    public final void observeStyle(@NotNull LifecycleOwner lifecycleOwner, @NotNull Observer<FaceData.BgStyle> observer) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(observer, "observer");
        getLiveData().observe(lifecycleOwner, observer);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View v) {
        int i;
        Intrinsics.checkNotNullParameter(v, "v");
        Object tag = v.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.xiaomi.fitness.watch.face.export.data.FaceData.BgStyle");
        FaceData.BgStyle bgStyle = (FaceData.BgStyle) tag;
        Parcelable[] parcelableArr = this.data;
        int length = parcelableArr.length;
        int i2 = 0;
        while (true) {
            i = -1;
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            Parcelable parcelable = parcelableArr[i2];
            FaceData.BgStyle bgStyle2 = parcelable instanceof FaceData.BgStyle ? (FaceData.BgStyle) parcelable : null;
            if (Intrinsics.areEqual(bgStyle2 != null ? bgStyle2.getStyle() : null, this.curUrl)) {
                break;
            } else {
                i2++;
            }
        }
        this.curUrl = bgStyle.getStyle();
        Parcelable[] parcelableArr2 = this.data;
        int length2 = parcelableArr2.length;
        for (int i3 = 0; i3 < length2; i3++) {
            Parcelable parcelable2 = parcelableArr2[i3];
            FaceData.BgStyle bgStyle3 = parcelable2 instanceof FaceData.BgStyle ? (FaceData.BgStyle) parcelable2 : null;
            if (Intrinsics.areEqual(bgStyle3 != null ? bgStyle3.getStyle() : null, this.curUrl)) {
                i = i3;
                break;
            }
        }
        if (i2 >= 0) {
            notifyItemChanged(i2);
        }
        if (i >= 0) {
            notifyItemChanged(i);
        }
        getLiveData().setValue(bgStyle);
    }

    public final void setBgView(@NotNull FaceInfoView faceInfoView) {
        Intrinsics.checkNotNullParameter(faceInfoView, "<set-?>");
        this.bgView = faceInfoView;
    }

    public final void setCurUrl(@Nullable String str) {
        this.curUrl = str;
    }

    public final void setMImageView(@NotNull FaceInfoView faceInfoView) {
        Intrinsics.checkNotNullParameter(faceInfoView, "<set-?>");
        this.mImageView = faceInfoView;
    }

    public final void setMultiPhotos(boolean z) {
        this.isMultiPhotos = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull Holder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindView(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public Holder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = getMInflater().inflate(ovi.V, parent, false);
        viewInflate.setOnClickListener(this);
        setMImageView((FaceInfoView) viewInflate.findViewById(isi.T0));
        setBgView((FaceInfoView) viewInflate.findViewById(isi.q));
        Intrinsics.checkNotNull(viewInflate);
        return new Holder(this, viewInflate);
    }
}
