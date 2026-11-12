package com.xiaomi.fitness.devicesettings.bluttooth.music;

import android.os.RemoteException;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSubListActivity;
import com.xiaomi.fitness.devicesettings.bluttooth.music.bean.MusicBean;
import com.xiaomi.fitness.devicesettings.bluttooth.music.bean.MusicListBean;
import defpackage.eui;
import defpackage.jd6;
import defpackage.jni;
import defpackage.wc0;
import defpackage.wzi;
import defpackage.xc6;
import defpackage.zwh;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSubListActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicPushViewModel;", "Ljd6;", "", "bindView", "(Ljd6;)V", "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/bean/MusicListBean;", "dataList", "Ljava/util/List;", "", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "()V", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMusicSubListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicSubListActivity.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSubListActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,80:1\n1863#2,2:81\n1010#2,2:83\n1863#2,2:85\n774#2:87\n865#2,2:88\n*S KotlinDebug\n*F\n+ 1 MusicSubListActivity.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSubListActivity\n*L\n51#1:81,2\n65#1:83,2\n36#1:85,2\n71#1:87\n71#1:88,2\n*E\n"})
public final class MusicSubListActivity extends BaseBindingActivity<MusicPushViewModel, jd6> {

    @NotNull
    public static final String sList = "sList";

    @NotNull
    public static final String sTitle = "sTitle";

    @NotNull
    private List<MusicListBean> dataList = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$1(MusicSubListActivity this$0, View view) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ArrayList<MusicBean> arrayList = new ArrayList<>();
        for (MusicListBean musicListBean : this$0.dataList) {
            if (musicListBean.getIsSelect()) {
                arrayList.addAll(musicListBean.getMusicList());
            }
        }
        xc6.b("onSaveBtnClick startPush " + arrayList.size());
        MusicPushServiceContact.INSTANCE.startPush(arrayList);
        this$0.setResult(-1);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$5(MusicSubListActivity this$0, boolean z, MusicListBean musicListBean) {
        View endView;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(musicListBean, "<unused var>");
        List<MusicListBean> list = this$0.dataList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((MusicListBean) obj).getIsSelect()) {
                arrayList.add(obj);
            }
        }
        wc0 miuiActionBar = this$0.getMiuiActionBar();
        if (miuiActionBar != null && (endView = miuiActionBar.getEndView()) != null) {
            endView.setVisibility(arrayList.isEmpty() ? 8 : 0);
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull jd6 jd6Var) {
        String artist;
        View endView;
        Intrinsics.checkNotNullParameter(jd6Var, "<this>");
        setTitle(getIntent().getStringExtra(sTitle));
        IActionBar.DefaultImpls.setEndView$default(this, 0, jni.f1, getString(wzi.sf), new View.OnClickListener() { // from class: kdg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws RemoteException {
                MusicSubListActivity.bindView$lambda$1(this.f23753a, view);
            }
        }, 1, null);
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null && (endView = miuiActionBar.getEndView()) != null) {
            endView.setVisibility(8);
        }
        ArrayList<MusicBean> parcelableArrayListExtra = getIntent().getParcelableArrayListExtra(sList);
        Intrinsics.checkNotNull(parcelableArrayListExtra);
        jd6Var.A.setLayoutManager(new LinearLayoutManager(this));
        for (MusicBean musicBean : parcelableArrayListExtra) {
            if (musicBean.getArtist() == null || musicBean.getAlbum() == null) {
                artist = musicBean.getArtist();
                if (artist == null) {
                    artist = ResourceExtKt.getString(wzi.D5);
                }
            } else {
                artist = getString(wzi.B5, musicBean.getArtist(), musicBean.getAlbum());
            }
            Intrinsics.checkNotNull(artist);
            MusicListBean musicListBean = new MusicListBean(0, musicBean.getName(), artist);
            musicListBean.getMusicList().add(musicBean);
            this.dataList.add(musicListBean);
        }
        List<MusicListBean> list = this.dataList;
        if (list.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(list, new Comparator() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSubListActivity$bindView$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    String strB = zwh.b(zwh.d(((MusicListBean) t).getName()));
                    xc6.d("MusicPushViewModel pinyin:" + strB);
                    String strB2 = zwh.b(zwh.d(((MusicListBean) t2).getName()));
                    xc6.d("MusicPushViewModel pinyin:" + strB2);
                    return ComparisonsKt__ComparisonsKt.compareValues(strB, strB2);
                }
            });
        }
        jd6Var.A.setAdapter(new MusicListAdapter(this, this.dataList, new Function2() { // from class: ldg
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MusicSubListActivity.bindView$lambda$5(this.f24939a, ((Boolean) obj).booleanValue(), (MusicListBean) obj2);
            }
        }));
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.h;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }
}
