package com.huawei.ui.device.fragment.music;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicSong;

/* JADX INFO: loaded from: classes16.dex */
public class SongFragment extends BaseLocalMusicFragment {
    @Override // com.huawei.ui.device.fragment.music.BaseLocalMusicFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        super.a(MusicSong.SORT_TYPE_SONG);
        return viewOnCreateView;
    }

    @Override // com.huawei.ui.device.fragment.music.BaseLocalMusicFragment
    public boolean d() {
        return super.d();
    }
}
