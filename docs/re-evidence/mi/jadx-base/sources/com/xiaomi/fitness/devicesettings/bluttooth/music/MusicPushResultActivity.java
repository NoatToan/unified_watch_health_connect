package com.xiaomi.fitness.devicesettings.bluttooth.music;

import android.os.RemoteException;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.devicesettings.bluttooth.music.MusicPushResultActivity;
import com.xiaomi.fitness.devicesettings.bluttooth.music.bean.MusicBean;
import defpackage.eui;
import defpackage.hd6;
import defpackage.wzi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicPushResultActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicPushViewModel;", "Lhd6;", "", "bindView", "(Lhd6;)V", "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/bean/MusicBean;", "dataList", "Ljava/util/List;", "", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "()V", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMusicPushResultActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicPushResultActivity.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/music/MusicPushResultActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n1863#2,2:53\n*S KotlinDebug\n*F\n+ 1 MusicPushResultActivity.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/music/MusicPushResultActivity\n*L\n34#1:53,2\n*E\n"})
public final class MusicPushResultActivity extends BaseBindingActivity<MusicPushViewModel, hd6> {

    @NotNull
    public static final String sMusicPushResultList = "sMusicPushResultList";

    @NotNull
    private List<MusicBean> dataList = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$1(Ref.ObjectRef notSuccessList, MusicPushResultActivity this$0, View view) throws RemoteException {
        Intrinsics.checkNotNullParameter(notSuccessList, "$notSuccessList");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MusicPushServiceContact.INSTANCE.startPush((ArrayList) notSuccessList.element);
        this$0.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, java.util.ArrayList] */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull hd6 hd6Var) {
        Intrinsics.checkNotNullParameter(hd6Var, "<this>");
        setTitle(wzi.w6);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra(sMusicPushResultList);
        Intrinsics.checkNotNull(parcelableArrayListExtra);
        hd6Var.A.setLayoutManager(new LinearLayoutManager(this));
        this.dataList.clear();
        this.dataList.addAll(parcelableArrayListExtra);
        hd6Var.A.setAdapter(new MusicPushResultAdapter(this, this.dataList));
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new ArrayList();
        for (MusicBean musicBean : this.dataList) {
            if (!musicBean.getIsDownLoadSuccess()) {
                ((ArrayList) objectRef.element).add(musicBean);
            }
        }
        hd6Var.B.setVisibility(((ArrayList) objectRef.element).isEmpty() ? 8 : 0);
        hd6Var.B.setOnClickListener(new View.OnClickListener() { // from class: ubg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws RemoteException {
                MusicPushResultActivity.bindView$lambda$1(objectRef, this, view);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.g;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }
}
