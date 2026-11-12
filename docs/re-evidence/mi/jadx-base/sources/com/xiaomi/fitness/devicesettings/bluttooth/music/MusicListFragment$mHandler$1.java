package com.xiaomi.fitness.devicesettings.bluttooth.music;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.xiaomi.fitness.devicesettings.bluttooth.music.MusicListFragment$mHandler$1;
import com.xiaomi.fitness.devicesettings.utils.MusicUtils;
import defpackage.wzi;
import defpackage.xc6;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/xiaomi/fitness/devicesettings/bluttooth/music/MusicListFragment$mHandler$1", "Landroid/os/Handler;", "handleMessage", "", "msg", "Landroid/os/Message;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MusicListFragment$mHandler$1 extends Handler {
    final /* synthetic */ MusicListFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicListFragment$mHandler$1(MusicListFragment musicListFragment, Looper looper) {
        super(looper);
        this.this$0 = musicListFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleMessage$lambda$0(MusicListFragment this$0, String text, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(text, "$text");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.dataList.clear();
        this$0.dataList.addAll(it);
        this$0.getMBinding().H.setText(TextUtils.isEmpty(text) ? this$0.getString(wzi.p6, MusicUtils.INSTANCE.parseType(this$0.supportType, false)) : this$0.getString(wzi.Y6));
        this$0.showOrHidenEmpty();
        MusicListAdapter musicListAdapter = this$0.musicListAdapter;
        if (musicListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("musicListAdapter");
            musicListAdapter = null;
        }
        musicListAdapter.notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    @Override // android.os.Handler
    public void handleMessage(Message msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (msg.what == 100) {
            Object obj = msg.obj;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
            final String str = (String) obj;
            xc6.d("MusicListFragment handleMessage:" + str);
            MusicListViewModel musicListViewModelAccess$getMViewModel = MusicListFragment.access$getMViewModel(this.this$0);
            final MusicListFragment musicListFragment = this.this$0;
            musicListViewModelAccess$getMViewModel.filterByKey(str, new Function1() { // from class: qbg
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return MusicListFragment$mHandler$1.handleMessage$lambda$0(musicListFragment, str, (List) obj2);
                }
            });
        }
    }
}
