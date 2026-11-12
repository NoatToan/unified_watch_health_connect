package com.xiaomi.fitness.devicesettings.bluttooth.music;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import androidx.fragment.app.FragmentManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingFragment$musicPushState$1;
import com.xiaomi.fitness.devicesettings.bluttooth.music.bean.ItemPushStartBean;
import com.xiaomi.fitness.devicesettings.bluttooth.music.bean.MusicBean;
import com.xiaomi.fitness.devicesettings.utils.UtilsKt;
import defpackage.qyi;
import defpackage.rzi;
import defpackage.wzi;
import defpackage.xc6;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/xiaomi/fitness/devicesettings/bluttooth/music/MusicSettingFragment$musicPushState$1", "Landroid/os/Handler;", "handleMessage", "", "msg", "Landroid/os/Message;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMusicSettingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicSettingFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSettingFragment$musicPushState$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,793:1\n774#2:794\n865#2,2:795\n*S KotlinDebug\n*F\n+ 1 MusicSettingFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSettingFragment$musicPushState$1\n*L\n124#1:794\n124#1:795,2\n*E\n"})
public final class MusicSettingFragment$musicPushState$1 extends Handler {
    final /* synthetic */ MusicSettingFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicSettingFragment$musicPushState$1(MusicSettingFragment musicSettingFragment, Looper looper) {
        super(looper);
        this.this$0 = musicSettingFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleMessage$lambda$1(MusicSettingFragment this$0, Ref.ObjectRef retList, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(retList, "$retList");
        Intent intent = new Intent(this$0.requireActivity(), (Class<?>) MusicPushResultActivity.class);
        intent.putExtra(MusicPushResultActivity.sMusicPushResultList, (Serializable) retList.element);
        this$0.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [T, java.util.ArrayList] */
    @Override // android.os.Handler
    public void handleMessage(Message msg) throws RemoteException {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (this.this$0.isInvalid()) {
            return;
        }
        int i = msg.what;
        if (i == 0) {
            Object obj = msg.obj;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.xiaomi.fitness.devicesettings.bluttooth.music.bean.ItemPushStartBean");
            ItemPushStartBean itemPushStartBean = (ItemPushStartBean) obj;
            String string = this.this$0.getString(wzi.q6, Integer.valueOf(itemPushStartBean.getCurrentIndex()), Integer.valueOf(itemPushStartBean.getAllSize()));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            xc6.d("MusicSettingFragment sCmdOnItemPushStart");
            this.this$0.getMBinding().U.setText(string);
            this.this$0.getMBinding().S.setText(itemPushStartBean.getMusicBean().getName());
            this.this$0.getMBinding().T.setProgress(0);
            this.this$0.getMBinding().H.setVisibility(8);
            this.this$0.getMBinding().N.setVisibility(0);
            this.this$0.isPushingMusic = true;
            return;
        }
        if (i == 1) {
            this.this$0.isPushingMusic = true;
            Object obj2 = msg.obj;
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Pair<com.xiaomi.fitness.devicesettings.bluttooth.music.bean.MusicBean, kotlin.Int>");
            Pair pair = (Pair) obj2;
            xc6.d("MusicSettingFragment sCmdOnItemPush " + pair.getFirst() + " " + pair.getSecond());
            this.this$0.getMBinding().S.setText(((MusicBean) pair.getFirst()).getName());
            this.this$0.getMBinding().T.setProgress(((Number) pair.getSecond()).intValue());
            this.this$0.getMBinding().R.setText(this.this$0.getString(rzi.common_percent_join_str, pair.getSecond()));
            this.this$0.getMBinding().H.setVisibility(8);
            this.this$0.getMBinding().N.setVisibility(0);
            return;
        }
        if (i != 2) {
            if (i == 3) {
                MusicBean musicBean = (MusicBean) msg.obj;
                xc6.d("MusicSettingFragment sCmdOnItemPushEnd " + musicBean);
                this.this$0.handleWhenSongPushEnd(musicBean, false);
                return;
            }
            if (i != 4) {
                return;
            }
            this.this$0.isPushingMusic = false;
            xc6.d("MusicSettingFragment sCmdOnLowSrorage");
            String string2 = this.this$0.getString(wzi.r6);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            int i2 = wzi.common_known;
            FragmentManager parentFragmentManager = this.this$0.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            UtilsKt.showMsgDialog$default(null, string2, i2, parentFragmentManager, 0, null, null, 112, null);
            return;
        }
        this.this$0.isPushingMusic = false;
        this.this$0.getMBinding().H.setVisibility(0);
        this.this$0.getMBinding().N.setVisibility(8);
        Object obj3 = msg.obj;
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type java.util.ArrayList<com.xiaomi.fitness.devicesettings.bluttooth.music.bean.MusicBean>");
        ArrayList arrayList = (ArrayList) obj3;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? arrayList2 = new ArrayList();
        objectRef.element = arrayList2;
        arrayList2.addAll(arrayList);
        MusicPushServiceContact.INSTANCE.flushComplete();
        Iterable iterable = (Iterable) objectRef.element;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : iterable) {
            if (((MusicBean) obj4).getIsDownLoadSuccess()) {
                arrayList3.add(obj4);
            }
        }
        xc6.d("MusicSettingFragment sCmdOnPushEnd list:" + arrayList.size() + " retList:" + ((ArrayList) objectRef.element).size() + " successList:" + arrayList3.size());
        String quantityString = ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), qyi.q, arrayList3.size(), Integer.valueOf(arrayList3.size()));
        String quantityString2 = ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), qyi.p, ((ArrayList) objectRef.element).size() - arrayList3.size(), Integer.valueOf(((ArrayList) objectRef.element).size() - arrayList3.size()));
        StringBuilder sb = new StringBuilder();
        sb.append(quantityString);
        sb.append(quantityString2);
        String string3 = sb.toString();
        int i3 = wzi.t6;
        FragmentManager parentFragmentManager2 = this.this$0.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager2, "getParentFragmentManager(...)");
        int i4 = wzi.s6;
        final MusicSettingFragment musicSettingFragment = this.this$0;
        UtilsKt.showMsgDialog$default(null, string3, i3, parentFragmentManager2, i4, new Function1() { // from class: tcg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj5) {
                return MusicSettingFragment$musicPushState$1.handleMessage$lambda$1(musicSettingFragment, objectRef, (DialogInterface) obj5);
            }
        }, null, 64, null);
    }
}
