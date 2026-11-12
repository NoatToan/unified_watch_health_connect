package com.xiaomi.fitness.detail.video.share.holder;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.detail.video.share.adapter.AddPicAdapter;
import com.xiaomi.fitness.detail.video.share.holder.AddPicHolder;
import com.xiaomi.fitness.detail.video.share.model.SportTracePointDataModel;
import com.xiaomi.fitness.detail.video.share.util.SportTraceVideoShareUtilKt;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.brp;
import defpackage.j1j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 #2\u00020\u0001:\u0001#BA\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u001a\u0010\u0013\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00100\u000f\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0004\b!\u0010\"J\u001d\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\bR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR(\u0010\u0013\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/detail/video/share/holder/AddPicHolder;", "", "Lkotlin/Function0;", "", "addPic", "checkIfImgCountExceedMaxCount", "(Lkotlin/jvm/functions/Function0;)V", "initData", "()V", "refreshAddPicView", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "context", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "getContext", "()Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "Landroidx/lifecycle/MutableLiveData;", "", "", "Lcom/xiaomi/fitness/detail/video/share/model/SportTracePointDataModel;", "traceDataMapLiveData", "Landroidx/lifecycle/MutableLiveData;", "curtProgressLiveData", "Landroid/widget/TextView;", "titleTv", "Landroid/widget/TextView;", "Landroidx/recyclerview/widget/RecyclerView;", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/detail/video/share/adapter/AddPicAdapter;", "addPicAdapter", "Lcom/xiaomi/fitness/detail/video/share/adapter/AddPicAdapter;", "Lbrp;", "mBinding", "<init>", "(Lcom/xiaomi/fitness/baseui/view/BaseActivity;Lbrp;Landroidx/lifecycle/MutableLiveData;Landroidx/lifecycle/MutableLiveData;)V", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AddPicHolder {

    @NotNull
    public static final String TAG = "AddPicHolder";

    @NotNull
    private final AddPicAdapter addPicAdapter;

    @NotNull
    private final BaseActivity context;

    @NotNull
    private final MutableLiveData<Float> curtProgressLiveData;

    @NotNull
    private final RecyclerView mRecyclerView;

    @NotNull
    private final TextView titleTv;

    @NotNull
    private final MutableLiveData<Map<Float, SportTracePointDataModel>> traceDataMapLiveData;

    /* JADX INFO: renamed from: com.xiaomi.fitness.detail.video.share.holder.AddPicHolder$initData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/detail/video/share/holder/AddPicHolder$initData$1", "Lcom/xiaomi/fitness/detail/video/share/adapter/AddPicAdapter$OnPicItemClickListener;", "onRemovePicItemClick", "", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "onAddButtonClick", "pos", "", "onPicCountChange", "countAdded", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 implements AddPicAdapter.OnPicItemClickListener {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onAddButtonClick$lambda$1(final AddPicHolder this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intent data = new Intent("android.intent.action.PICK").setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            Intrinsics.checkNotNullExpressionValue(data, "setData(...)");
            this$0.getContext().startForActivityResult(data, new Function2() { // from class: mt0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AddPicHolder.AnonymousClass1.onAddButtonClick$lambda$1$lambda$0(this$0, ((Integer) obj).intValue(), (Intent) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onAddButtonClick$lambda$1$lambda$0(AddPicHolder this$0, int i, Intent intent) {
            Object data;
            Uri data2;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (intent == null || (data = intent.getData()) == null) {
                data = AbstractJsonLexerKt.NULL;
            }
            Logger.i(AddPicHolder.TAG, "onAddButtonClick uri=" + data);
            if (intent != null && (data2 = intent.getData()) != null) {
                try {
                    long fileSizeInMBInBytes = SportTraceVideoShareUtilKt.getFileSizeInMBInBytes(data2);
                    boolean zIsImgSizeValid = SportTraceVideoShareUtilKt.isImgSizeValid(fileSizeInMBInBytes);
                    boolean zCheckIfAnImgTypeIsSupported = SportTraceVideoShareUtilKt.checkIfAnImgTypeIsSupported(data2);
                    Logger.i(AddPicHolder.TAG, "onAddButtonClick size:" + fileSizeInMBInBytes + " sizeIsValid=" + zIsImgSizeValid + " typeIsSupported=" + zCheckIfAnImgTypeIsSupported);
                    if (zIsImgSizeValid && zCheckIfAnImgTypeIsSupported) {
                        this$0.addPicAdapter.addNewPic(data2);
                        return Unit.INSTANCE;
                    }
                    ToastExtKt.toastShort(ApplicationExtKt.getApplication(), j1j.l9);
                    return Unit.INSTANCE;
                } catch (Exception e) {
                    Logger.i(AddPicHolder.TAG, "pickImgFromGalleryIntent failed. error=" + e);
                    ToastExtKt.toastShort(ApplicationExtKt.getApplication(), j1j.common_not_support);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // com.xiaomi.fitness.detail.video.share.adapter.AddPicAdapter.OnPicItemClickListener
        public void onAddButtonClick(int pos) {
            final AddPicHolder addPicHolder = AddPicHolder.this;
            addPicHolder.checkIfImgCountExceedMaxCount(new Function0() { // from class: lt0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AddPicHolder.AnonymousClass1.onAddButtonClick$lambda$1(addPicHolder);
                }
            });
        }

        @Override // com.xiaomi.fitness.detail.video.share.adapter.AddPicAdapter.OnPicItemClickListener
        public void onPicCountChange(int countAdded) {
            AddPicHolder.this.titleTv.setText(ResourceExtKt.getString(j1j.Ca, Integer.valueOf(countAdded)));
            SportTraceVideoShareUtilKt.updateImageUrisToAdd(AddPicHolder.this.traceDataMapLiveData, AddPicHolder.this.curtProgressLiveData, AddPicHolder.this.addPicAdapter.getUriList());
        }

        @Override // com.xiaomi.fitness.detail.video.share.adapter.AddPicAdapter.OnPicItemClickListener
        public void onRemovePicItemClick(Uri uri) {
            int iIndexOf;
            SportTracePointDataModel sportTracePointDataModel;
            Intrinsics.checkNotNullParameter(uri, "uri");
            AddPicHolder.this.addPicAdapter.removePic(uri);
            Map map = (Map) AddPicHolder.this.traceDataMapLiveData.getValue();
            List<Uri> imgUriList = (map == null || (sportTracePointDataModel = (SportTracePointDataModel) map.get(AddPicHolder.this.curtProgressLiveData.getValue())) == null) ? null : sportTracePointDataModel.getImgUriList();
            List<Uri> list = imgUriList;
            if (list == null || list.isEmpty() || (iIndexOf = imgUriList.indexOf(uri)) < 0 || iIndexOf >= imgUriList.size()) {
                return;
            }
            ListExtKt.remove(imgUriList, iIndexOf);
        }
    }

    public AddPicHolder(@NotNull BaseActivity context, @NotNull brp mBinding, @NotNull MutableLiveData<Map<Float, SportTracePointDataModel>> traceDataMapLiveData, @NotNull MutableLiveData<Float> curtProgressLiveData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mBinding, "mBinding");
        Intrinsics.checkNotNullParameter(traceDataMapLiveData, "traceDataMapLiveData");
        Intrinsics.checkNotNullParameter(curtProgressLiveData, "curtProgressLiveData");
        this.context = context;
        this.traceDataMapLiveData = traceDataMapLiveData;
        this.curtProgressLiveData = curtProgressLiveData;
        TextView addedPicCountTitle = mBinding.B;
        Intrinsics.checkNotNullExpressionValue(addedPicCountTitle, "addedPicCountTitle");
        this.titleTv = addedPicCountTitle;
        RecyclerView addPicRecycler = mBinding.A;
        Intrinsics.checkNotNullExpressionValue(addPicRecycler, "addPicRecycler");
        this.mRecyclerView = addPicRecycler;
        this.addPicAdapter = new AddPicAdapter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkIfImgCountExceedMaxCount(Function0<Unit> addPic) {
        int allPicCountInMap = SportTraceVideoShareUtilKt.getAllPicCountInMap(this.traceDataMapLiveData);
        Logger.d(TAG, "checkIfImgCountExceedMaxCount imgAlreadyAddedCount=" + allPicCountInMap);
        if (allPicCountInMap >= 9) {
            ToastExtKt.toastShort(this.context, j1j.m9);
        } else {
            addPic.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence refreshAddPicView$lambda$0(Uri it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "uri=" + it;
    }

    @NotNull
    public final BaseActivity getContext() {
        return this.context;
    }

    public final void initData() {
        this.titleTv.setText(ResourceExtKt.getString(j1j.Ca, 0));
        this.addPicAdapter.setOnItemClickListener(new AnonymousClass1());
        this.mRecyclerView.setAdapter(this.addPicAdapter);
        this.addPicAdapter.setRecyclerView(this.mRecyclerView);
        this.addPicAdapter.updateDataList(CollectionsKt__CollectionsKt.emptyList());
    }

    public final void refreshAddPicView() {
        SportTracePointDataModel tracePointDataModelByProgressValue = SportTraceVideoShareUtilKt.getTracePointDataModelByProgressValue(this.traceDataMapLiveData, this.curtProgressLiveData);
        List<Uri> imgUriList = tracePointDataModelByProgressValue != null ? tracePointDataModelByProgressValue.getImgUriList() : null;
        Logger.d(SportTraceVideoShareUtilKt.SPORT_TRACE_TAG, "AddPicHolder refreshHolder imgList=" + (imgUriList != null ? CollectionsKt___CollectionsKt.joinToString$default(imgUriList, null, null, null, 0, null, new Function1() { // from class: kt0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AddPicHolder.refreshAddPicView$lambda$0((Uri) obj);
            }
        }, 31, null) : null));
        this.addPicAdapter.updateDataList(imgUriList);
        TextView textView = this.titleTv;
        int i = j1j.Ca;
        Object[] objArr = new Object[1];
        objArr[0] = Integer.valueOf(imgUriList != null ? imgUriList.size() : 0);
        textView.setText(ResourceExtKt.getString(i, objArr));
    }
}
