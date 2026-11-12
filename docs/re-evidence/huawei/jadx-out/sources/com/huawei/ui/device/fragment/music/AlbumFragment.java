package com.huawei.ui.device.fragment.music;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicSong;
import com.huawei.ui.commonui.toolbar.HealthToolBar;
import com.huawei.ui.device.activity.music.LocalMusicResourceActivity;

/* JADX INFO: loaded from: classes16.dex */
public class AlbumFragment extends BaseLocalMusicFragment {
    @Override // com.huawei.ui.device.fragment.music.BaseLocalMusicFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        super.a(MusicSong.SORT_TYPE_ALBUM);
        return viewOnCreateView;
    }

    @Override // com.huawei.ui.device.fragment.music.BaseLocalMusicFragment
    public boolean d() {
        HealthToolBar healthToolBarD;
        if (this.f24917a == null) {
            return false;
        }
        if (this.f24917a.c() == 0) {
            if (getActivity() != null && (getActivity() instanceof LocalMusicResourceActivity) && (healthToolBarD = ((LocalMusicResourceActivity) getActivity()).d()) != null) {
                healthToolBarD.setVisibility(8);
            }
            this.f24917a.d(2);
            this.f24917a.c(this.i);
            this.f24917a.notifyDataSetChanged();
            return false;
        }
        return super.d();
    }
}
