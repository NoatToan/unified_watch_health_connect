package com.xiaomi.fitness.nfc.ui.issued;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.miui.tsmclient.sesdk.KeyCardArt;
import com.miui.tsmclient.sesdk.SDKConstants;
import com.xiaomi.fitness.nfc.ui.issued.MifareCardFaceListAdapter;
import defpackage.mri;
import defpackage.sui;
import defpackage.wni;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000212B?\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!\u0012\u0016\b\u0002\u0010)\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000b\u0018\u00010(¢\u0006\u0004\b/\u00100J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u000b2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR2\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R0\u0010)\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000b\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/MifareCardFaceListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "", "getItemId", "(I)J", "getItemCount", "()I", "", "Lcom/miui/tsmclient/sesdk/KeyCardArt$Art;", "list", "updateData", "(Ljava/util/List;)V", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/nfc/ui/issued/MifareCardFaceListAdapter$FaceBean;", "Lkotlin/collections/ArrayList;", "artInfoList", "Ljava/util/ArrayList;", "getArtInfoList", "()Ljava/util/ArrayList;", "setArtInfoList", "(Ljava/util/ArrayList;)V", "Lkotlin/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/jvm/functions/Function1;", "getListener", "()Lkotlin/jvm/functions/Function1;", "setListener", "(Lkotlin/jvm/functions/Function1;)V", "<init>", "(Landroid/content/Context;Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;)V", "MifareCardFaceViewHolder", "FaceBean", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class MifareCardFaceListAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @NotNull
    private ArrayList<FaceBean> artInfoList;

    @NotNull
    private Context context;

    @Nullable
    private Function1<? super FaceBean, Unit> listener;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/MifareCardFaceListAdapter$FaceBean;", "", SDKConstants.KEY_CARD_FACE, "Lcom/miui/tsmclient/sesdk/KeyCardArt$Art;", "<init>", "(Lcom/miui/tsmclient/sesdk/KeyCardArt$Art;)V", "getArt", "()Lcom/miui/tsmclient/sesdk/KeyCardArt$Art;", "setArt", "isSelected", "", "()Z", "setSelected", "(Z)V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FaceBean {

        @NotNull
        private KeyCardArt.Art art;
        private boolean isSelected;

        public FaceBean(@NotNull KeyCardArt.Art art) {
            Intrinsics.checkNotNullParameter(art, "art");
            this.art = art;
        }

        @NotNull
        public final KeyCardArt.Art getArt() {
            return this.art;
        }

        /* JADX INFO: renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        public final void setArt(@NotNull KeyCardArt.Art art) {
            Intrinsics.checkNotNullParameter(art, "<set-?>");
            this.art = art;
        }

        public final void setSelected(boolean z) {
            this.isSelected = z;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/MifareCardFaceListAdapter$MifareCardFaceViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/nfc/ui/issued/MifareCardFaceListAdapter$FaceBean;", "faceBean", "", "bindData", "(Lcom/xiaomi/fitness/nfc/ui/issued/MifareCardFaceListAdapter$FaceBean;)V", "Landroid/widget/ImageView;", "imgView", "Landroid/widget/ImageView;", "getImgView", "()Landroid/widget/ImageView;", "setImgView", "(Landroid/widget/ImageView;)V", "Landroid/view/View;", "selectIconView", "Landroid/view/View;", "getSelectIconView", "()Landroid/view/View;", "setSelectIconView", "(Landroid/view/View;)V", "itemView", "<init>", "(Lcom/xiaomi/fitness/nfc/ui/issued/MifareCardFaceListAdapter;Landroid/view/View;)V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nMifareCardFaceListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MifareCardFaceListAdapter.kt\ncom/xiaomi/fitness/nfc/ui/issued/MifareCardFaceListAdapter$MifareCardFaceViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,71:1\n54#2,3:72\n24#2:75\n59#2,6:76\n*S KotlinDebug\n*F\n+ 1 MifareCardFaceListAdapter.kt\ncom/xiaomi/fitness/nfc/ui/issued/MifareCardFaceListAdapter$MifareCardFaceViewHolder\n*L\n40#1:72,3\n40#1:75\n40#1:76,6\n*E\n"})
    public final class MifareCardFaceViewHolder extends RecyclerView.d0 {

        @Nullable
        private ImageView imgView;

        @Nullable
        private View selectIconView;
        final /* synthetic */ MifareCardFaceListAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MifareCardFaceViewHolder(@NotNull MifareCardFaceListAdapter mifareCardFaceListAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = mifareCardFaceListAdapter;
        }

        public final void bindData(@NotNull FaceBean faceBean) {
            Intrinsics.checkNotNullParameter(faceBean, "faceBean");
            this.imgView = (ImageView) this.itemView.findViewById(mri.z1);
            this.selectIconView = this.itemView.findViewById(mri.A1);
            ImageView imageView = this.imgView;
            if (imageView != null) {
                String url = faceBean.getArt().getUrl();
                ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
                ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(url).target(imageView);
                builderTarget.placeholder(wni.w);
                imageLoader.enqueue(builderTarget.build());
            }
            View view = this.selectIconView;
            if (view != null) {
                view.setVisibility(faceBean.getIsSelected() ? 0 : 8);
            }
        }

        @Nullable
        public final ImageView getImgView() {
            return this.imgView;
        }

        @Nullable
        public final View getSelectIconView() {
            return this.selectIconView;
        }

        public final void setImgView(@Nullable ImageView imageView) {
            this.imgView = imageView;
        }

        public final void setSelectIconView(@Nullable View view) {
            this.selectIconView = view;
        }
    }

    public /* synthetic */ MifareCardFaceListAdapter(Context context, ArrayList arrayList, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, arrayList, (i & 4) != 0 ? null : function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(MifareCardFaceListAdapter this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super FaceBean, Unit> function1 = this$0.listener;
        if (function1 != null) {
            FaceBean faceBean = this$0.artInfoList.get(i);
            Intrinsics.checkNotNullExpressionValue(faceBean, "get(...)");
            function1.invoke2(faceBean);
        }
    }

    @NotNull
    public final ArrayList<FaceBean> getArtInfoList() {
        return this.artInfoList;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.artInfoList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return position;
    }

    @Nullable
    public final Function1<FaceBean, Unit> getListener() {
        return this.listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof MifareCardFaceViewHolder) {
            FaceBean faceBean = this.artInfoList.get(position);
            Intrinsics.checkNotNullExpressionValue(faceBean, "get(...)");
            ((MifareCardFaceViewHolder) holder).bindData(faceBean);
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: hxf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MifareCardFaceListAdapter.onBindViewHolder$lambda$0(this.f20570a, position, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.context).inflate(sui.C0, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new MifareCardFaceViewHolder(this, viewInflate);
    }

    public final void setArtInfoList(@NotNull ArrayList<FaceBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.artInfoList = arrayList;
    }

    public final void setContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public final void setListener(@Nullable Function1<? super FaceBean, Unit> function1) {
        this.listener = function1;
    }

    public final void updateData(@Nullable List<? extends KeyCardArt.Art> list) {
        this.artInfoList.clear();
        if (list != null && !list.isEmpty()) {
            Iterator<? extends KeyCardArt.Art> it = list.iterator();
            while (it.hasNext()) {
                this.artInfoList.add(new FaceBean(it.next()));
            }
        }
        notifyDataSetChanged();
    }

    public MifareCardFaceListAdapter(@NotNull Context context, @NotNull ArrayList<FaceBean> artInfoList, @Nullable Function1<? super FaceBean, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(artInfoList, "artInfoList");
        this.context = context;
        this.artInfoList = artInfoList;
        this.listener = function1;
    }
}
