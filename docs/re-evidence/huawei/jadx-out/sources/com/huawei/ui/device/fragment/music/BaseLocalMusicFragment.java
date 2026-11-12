package com.huawei.ui.device.fragment.music;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.widget.SearchView;
import com.huawei.haf.common.os.KeyboardUtils;
import com.huawei.health.suggestion.util.StaticHandler;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicSong;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.searchview.HealthSearchView;
import com.huawei.ui.device.R;
import com.huawei.ui.device.activity.music.LocalMusicResourceActivity;
import com.huawei.ui.device.views.music.AlphabetIndexWaveSideBarView;
import com.huawei.ui.device.views.music.LocalMusicSearchThreadManager;
import defpackage.rdd;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class BaseLocalMusicFragment extends BaseFragment implements LocalMusicSearchThreadManager.SearchCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected BaseLocalMusicAdapter f24917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected HealthSearchView f24918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected AlphabetIndexWaveSideBarView f24919c;
    protected List<MusicSong> d;
    protected Context e;
    protected String f;
    protected List<String> g;
    protected LocalMusicSearchThreadManager h;
    protected List<MusicSong> i;
    protected ListView j;
    protected HealthTextView k;
    private LinearLayout l;
    protected HealthTextView m;
    private LinearLayout n;
    private e o = new e(this);
    private c q = new c(this);
    private ArrayList<MusicSong> p = new ArrayList<>(16);

    public boolean d() {
        return true;
    }

    protected static class e extends StaticHandler<BaseLocalMusicFragment> {
        e(BaseLocalMusicFragment baseLocalMusicFragment) {
            super(baseLocalMusicFragment);
        }

        @Override // com.huawei.health.suggestion.util.StaticHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessage(BaseLocalMusicFragment baseLocalMusicFragment, Message message) {
            if (baseLocalMusicFragment == null || message == null || baseLocalMusicFragment.f24917a == null) {
                return;
            }
            int i = message.what;
            boolean z = true;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                baseLocalMusicFragment.f24917a.c(new ArrayList(16));
                baseLocalMusicFragment.f24917a.notifyDataSetChanged();
                return;
            }
            if (message.obj instanceof List) {
                baseLocalMusicFragment.f24917a.c((List<MusicSong>) message.obj);
            }
            boolean[] zArrD = baseLocalMusicFragment.f24917a.d();
            boolean[] zArrA = baseLocalMusicFragment.f24917a.a();
            for (boolean z2 : zArrD) {
                if (!z2) {
                    z = false;
                }
            }
            if (baseLocalMusicFragment.e instanceof LocalMusicResourceActivity) {
                if (!z && baseLocalMusicFragment.f24917a.c() == 0) {
                    ((LocalMusicResourceActivity) baseLocalMusicFragment.e).d().setVisibility(0);
                } else {
                    ((LocalMusicResourceActivity) baseLocalMusicFragment.e).d().setVisibility(8);
                }
            }
            boolean zE = false;
            if (zArrD.length == zArrA.length && zArrD.length > 0) {
                zE = e(zArrD, zArrA);
            }
            if (baseLocalMusicFragment.e instanceof LocalMusicResourceActivity) {
                ((LocalMusicResourceActivity) baseLocalMusicFragment.e).e(baseLocalMusicFragment.f24917a.b().size(), zE);
            }
            baseLocalMusicFragment.j.requestLayout();
            baseLocalMusicFragment.f24917a.notifyDataSetChanged();
        }

        private Boolean e(boolean[] zArr, boolean[] zArr2) {
            for (int i = 0; i < zArr.length; i++) {
                if (!zArr[i] && !zArr2[i]) {
                    return false;
                }
            }
            return true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_music_song_layout, viewGroup, false);
        this.m = (HealthTextView) viewInflate.findViewById(R.id.hw_local_music_tip);
        this.k = (HealthTextView) viewInflate.findViewById(R.id.music_empty_format_tips);
        this.f24918b = (HealthSearchView) viewInflate.findViewById(R.id.music_search_view);
        this.j = (ListView) viewInflate.findViewById(R.id.hw_local_songs_list);
        this.f24919c = (AlphabetIndexWaveSideBarView) viewInflate.findViewById(R.id.bar_list);
        this.n = (LinearLayout) viewInflate.findViewById(R.id.data_ll);
        this.l = (LinearLayout) viewInflate.findViewById(R.id.empty_ll);
        this.e = getActivity();
        this.f24918b.setOnQueryTextListener(this.q);
        this.i = new ArrayList(16);
        if (getActivity() instanceof LocalMusicResourceActivity) {
            LocalMusicResourceActivity localMusicResourceActivity = (LocalMusicResourceActivity) getActivity();
            this.i.addAll(localMusicResourceActivity.b());
            this.d = localMusicResourceActivity.c();
            this.g = localMusicResourceActivity.a();
        }
        a();
        BaseLocalMusicAdapter baseLocalMusicAdapter = new BaseLocalMusicAdapter(this.e, this.i, this.d);
        this.f24917a = baseLocalMusicAdapter;
        this.j.setAdapter((ListAdapter) baseLocalMusicAdapter);
        LocalMusicSearchThreadManager localMusicSearchThreadManager = new LocalMusicSearchThreadManager();
        this.h = localMusicSearchThreadManager;
        localMusicSearchThreadManager.c();
        this.h.d(this);
        e();
        if (this.i.size() > 0) {
            this.n.setVisibility(0);
            return viewInflate;
        }
        this.l.setVisibility(0);
        return viewInflate;
    }

    private void a() {
        List<String> list = this.g;
        if (list == null || list.isEmpty()) {
            LogUtil.j("BaseLocalMusicFragment", "mSupportMusicTypeFilterList is empty.");
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        if (this.g.contains("MP3")) {
            arrayList.add(getResources().getString(R.string.IDS_music_format_mp3));
        }
        if (this.g.contains("AAC")) {
            arrayList.add(getResources().getString(R.string.IDS_music_format_aac));
        }
        if (this.g.contains("WAV")) {
            arrayList.add(getResources().getString(R.string.IDS_music_format_wav));
        }
        if (this.g.contains("FLAC")) {
            arrayList.add(getResources().getString(R.string.IDS_music_format_flac));
        }
        if (this.g.contains("APE")) {
            arrayList.add(getResources().getString(R.string.IDS_music_format_ape));
        }
        if (this.g.contains("OGG")) {
            arrayList.add(getResources().getString(R.string.IDS_music_format_ogg));
        }
        if (this.g.contains("M4A")) {
            arrayList.add(getResources().getString(R.string.IDS_music_format_m4a));
        }
        if (this.g.contains("OPUS")) {
            arrayList.add(getResources().getString(R.string.IDS_music_format_opus));
        }
        if (this.g.contains("AMR")) {
            arrayList.add(getResources().getString(R.string.IDS_music_format_amr));
        }
        if (this.g.contains("IMY")) {
            arrayList.add(getResources().getString(R.string.IDS_music_format_imy));
        }
        String strB = b(arrayList);
        this.m.setText(getResources().getString(R.string.IDS_music_supported_format, strB));
        this.k.setText(getResources().getString(R.string.IDS_music_supported_format, strB));
    }

    private String b(List<String> list) {
        switch (list.size()) {
            case 1:
                return list.get(0);
            case 2:
                return getResources().getString(R.string.IDS_music_format_split2, list.get(0), list.get(1));
            case 3:
                return getResources().getString(R.string.IDS_music_format_split3, list.get(0), list.get(1), list.get(2));
            case 4:
                return getResources().getString(R.string.IDS_music_format_split4, list.get(0), list.get(1), list.get(2), list.get(3));
            case 5:
                return getResources().getString(R.string.IDS_music_format_split5, list.get(0), list.get(1), list.get(2), list.get(3), list.get(4));
            case 6:
                return getResources().getString(R.string.IDS_music_format_split6, list.get(0), list.get(1), list.get(2), list.get(3), list.get(4), list.get(5));
            case 7:
                return getResources().getString(R.string.IDS_music_format_split7, list.get(0), list.get(1), list.get(2), list.get(3), list.get(4), list.get(5), list.get(6));
            case 8:
                return c(list);
            default:
                return e(list);
        }
    }

    private String c(List<String> list) {
        return getResources().getString(R.string.IDS_music_format_split8, list.get(0), list.get(1), list.get(2), list.get(3), list.get(4), list.get(5), list.get(6), list.get(7));
    }

    private String e(List<String> list) {
        int size = list.size();
        if (size == 9) {
            return getResources().getString(R.string.IDS_music_format_split9, list.get(0), list.get(1), list.get(2), list.get(3), list.get(4), list.get(5), list.get(6), list.get(7), list.get(8));
        }
        if (size == 10) {
            return getResources().getString(R.string.IDS_music_format_split10, list.get(0), list.get(1), list.get(2), list.get(3), list.get(4), list.get(5), list.get(6), list.get(7), list.get(8), list.get(9));
        }
        return "";
    }

    protected void a(String str) {
        if (MusicSong.SORT_TYPE_SONG.equals(str)) {
            this.f24917a.d(0);
            this.f24917a.e(MusicSong.SORT_TYPE_SONG);
        } else if (MusicSong.SORT_TYPE_SINGER.equals(str)) {
            this.m.setVisibility(8);
            this.f24917a.d(1);
            this.f24917a.e(MusicSong.SORT_TYPE_SINGER);
        } else if (MusicSong.SORT_TYPE_ALBUM.equals(str)) {
            this.m.setVisibility(8);
            this.f24917a.d(2);
            this.f24917a.e(MusicSong.SORT_TYPE_ALBUM);
        } else if (MusicSong.SORT_TYPE_FOLDER.equals(str)) {
            this.m.setVisibility(8);
            this.f24917a.d(3);
            this.f24917a.e(MusicSong.SORT_TYPE_FOLDER);
        } else {
            LogUtil.a("BaseLocalMusicFragment", "error type");
        }
        this.f24917a.c(this.i);
        this.f24917a.notifyDataSetChanged();
    }

    private void e() {
        this.f24919c.setOnLetterChangeListener(new AlphabetIndexWaveSideBarView.OnLetterChangeListener() { // from class: com.huawei.ui.device.fragment.music.BaseLocalMusicFragment.2
            @Override // com.huawei.ui.device.views.music.AlphabetIndexWaveSideBarView.OnLetterChangeListener
            public void onLetterChange(String str) {
                int iB;
                if (BaseLocalMusicFragment.this.f24917a.c() == 0) {
                    iB = BaseLocalMusicFragment.this.f24917a.a(str);
                } else if (BaseLocalMusicFragment.this.f24917a.c() == 1) {
                    iB = BaseLocalMusicFragment.this.f24917a.c(str);
                } else if (BaseLocalMusicFragment.this.f24917a.c() == 2) {
                    iB = BaseLocalMusicFragment.this.f24917a.d(str);
                } else {
                    iB = BaseLocalMusicFragment.this.f24917a.b(str);
                }
                if (iB == -1 || BaseLocalMusicFragment.this.j == null) {
                    return;
                }
                BaseLocalMusicFragment.this.j.setSelection(iB);
            }
        });
        this.j.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.huawei.ui.device.fragment.music.BaseLocalMusicFragment.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (BaseLocalMusicFragment.this.f24917a == null || BaseLocalMusicFragment.this.f24917a.c() == 0) {
                    return;
                }
                BaseLocalMusicFragment.this.p.clear();
                if (BaseLocalMusicFragment.this.f24917a.getItem(i) instanceof ArrayList) {
                    BaseLocalMusicFragment.this.p.addAll((ArrayList) BaseLocalMusicFragment.this.f24917a.getItem(i));
                }
                LogUtil.a("BaseLocalMusicFragment", "mSongsSubSingers :" + BaseLocalMusicFragment.this.p.size());
                BaseLocalMusicFragment.this.f24917a.d(0);
                Message messageObtain = Message.obtain();
                messageObtain.what = 1;
                messageObtain.obj = BaseLocalMusicFragment.this.p;
                BaseLocalMusicFragment.this.o.sendMessage(messageObtain);
            }
        });
    }

    @Override // com.huawei.ui.device.views.music.LocalMusicSearchThreadManager.SearchCallback
    public void onSearchResult(List<MusicSong> list) {
        if (this.o != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = list;
            this.o.sendMessage(messageObtain);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (getActivity() == null || !z) {
            return;
        }
        if (getActivity() instanceof LocalMusicResourceActivity) {
            ((LocalMusicResourceActivity) getActivity()).d(this);
        }
        BaseLocalMusicAdapter baseLocalMusicAdapter = this.f24917a;
        if (baseLocalMusicAdapter != null) {
            baseLocalMusicAdapter.i();
            this.f24917a.notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.f24917a != null) {
            rdd.d().a();
        }
    }

    static class c implements SearchView.OnQueryTextListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<BaseLocalMusicFragment> f24921a;

        c(BaseLocalMusicFragment baseLocalMusicFragment) {
            if (baseLocalMusicFragment != null) {
                this.f24921a = new WeakReference<>(baseLocalMusicFragment);
            }
        }

        @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextSubmit(String str) {
            BaseLocalMusicFragment baseLocalMusicFragment = this.f24921a.get();
            if (baseLocalMusicFragment == null || baseLocalMusicFragment.o == null) {
                return false;
            }
            if (!TextUtils.isEmpty(str)) {
                baseLocalMusicFragment.c(str);
            } else {
                baseLocalMusicFragment.i();
            }
            if (baseLocalMusicFragment.f24918b == null) {
                return true;
            }
            KeyboardUtils.d(baseLocalMusicFragment.f24918b);
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextChange(String str) {
            BaseLocalMusicFragment baseLocalMusicFragment = this.f24921a.get();
            if (baseLocalMusicFragment == null || baseLocalMusicFragment.o == null) {
                return false;
            }
            if (!TextUtils.isEmpty(str)) {
                baseLocalMusicFragment.c(str);
                return true;
            }
            baseLocalMusicFragment.i();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        LocalMusicSearchThreadManager.SearchType searchType;
        this.o.sendEmptyMessage(2);
        this.f = str;
        if (this.f24917a.c() != 0) {
            if (this instanceof SingerFragment) {
                searchType = LocalMusicSearchThreadManager.SearchType.SINGER;
            } else if (this instanceof AlbumFragment) {
                searchType = LocalMusicSearchThreadManager.SearchType.ALBUM;
            } else if (this instanceof FolderFragment) {
                searchType = LocalMusicSearchThreadManager.SearchType.FOLDER;
            } else {
                searchType = LocalMusicSearchThreadManager.SearchType.SONG;
            }
        } else {
            searchType = LocalMusicSearchThreadManager.SearchType.SONG;
        }
        this.h.a(this.f, this.i, searchType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.f = null;
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        if ((this instanceof SongFragment) || this.f24917a.c() != 0) {
            messageObtain.obj = this.i;
        } else {
            messageObtain.obj = this.p;
        }
        this.o.sendMessage(messageObtain);
    }

    public ArrayList<MusicSong> b() {
        BaseLocalMusicAdapter baseLocalMusicAdapter = this.f24917a;
        if (baseLocalMusicAdapter != null) {
            return baseLocalMusicAdapter.b();
        }
        return null;
    }

    public BaseLocalMusicAdapter c() {
        return this.f24917a;
    }

    public void d(boolean z) {
        if (z) {
            for (int i = 0; i < this.f24917a.a().length; i++) {
                this.f24917a.a()[i] = false;
            }
            ArrayList<MusicSong> arrayListB = b();
            if (arrayListB != null) {
                arrayListB.removeAll(this.f24917a.e());
            }
        } else {
            for (int i2 = 0; i2 < this.f24917a.a().length; i2++) {
                this.f24917a.a()[i2] = true;
            }
            ArrayList arrayList = new ArrayList(16);
            for (MusicSong musicSong : this.f24917a.e()) {
                if (!this.d.contains(musicSong.getFileName())) {
                    arrayList.add(musicSong);
                }
            }
            ArrayList<MusicSong> arrayListB2 = b();
            if (arrayListB2 != null) {
                arrayListB2.removeAll(arrayList);
                arrayListB2.addAll(arrayList);
            }
        }
        this.f24917a.notifyDataSetChanged();
        if (getActivity() instanceof LocalMusicResourceActivity) {
            ((LocalMusicResourceActivity) getActivity()).e(this.f24917a.e().size(), Boolean.valueOf(!z));
        }
    }
}
