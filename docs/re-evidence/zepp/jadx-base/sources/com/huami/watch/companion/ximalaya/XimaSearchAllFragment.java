package com.huami.watch.companion.ximalaya;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.huami.watch.companion.R;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.util.AnalyticsEvents;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.Log;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest;
import com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack;
import com.ximalaya.ting.android.opensdk.model.album.Album;
import com.ximalaya.ting.android.opensdk.model.album.SearchAlbumList;
import com.ximalaya.ting.android.opensdk.model.track.SearchTrackList;
import com.ximalaya.ting.android.opensdk.model.track.Track;
import com.ximalaya.ting.android.opensdk.model.track.TrackHotList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class XimaSearchAllFragment extends Fragment {
    private static final String p = "XimaSearchAllFragment";
    private Context a;
    private CommonRequest f;
    private LinearLayout g;
    private LinearLayout h;
    private View i;
    private XimalayaSearchingActivity j;
    private boolean b = false;
    private int c = 1;
    private TrackHotList d = null;
    private boolean e = false;
    private String k = null;
    private SearchTrackList l = null;
    private SearchAlbumList m = null;
    private boolean n = false;
    private boolean o = false;

    public class a implements IDataCallBack<SearchAlbumList> {

        /* JADX INFO: renamed from: com.huami.watch.companion.ximalaya.XimaSearchAllFragment$a$a, reason: collision with other inner class name */
        public class ViewOnClickListenerC0664a implements View.OnClickListener {
            public final /* synthetic */ Album a;

            public ViewOnClickListenerC0664a(Album album) {
                this.a = album;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Analytics.event(XimaSearchAllFragment.this.j, AnalyticsEvents.EVENT_CLICK_INSERT_SEARCH_ALBUM);
                Intent intent = new Intent(XimaSearchAllFragment.this.a, (Class<?>) XimaAlbumActivity.class);
                intent.putExtra(DTransferConstants.ALBUM_ID, this.a.getId());
                intent.putExtra(XimalayaUtils.SEARCH_ALBUM, this.a);
                XimaSearchAllFragment.this.startActivity(intent);
            }
        }

        public a() {
        }

        @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(SearchAlbumList searchAlbumList) {
            if (XimaSearchAllFragment.this.b) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onSuccess ");
            sb.append(searchAlbumList != null);
            Log.d(XimaSearchAllFragment.p, sb.toString(), new Object[0]);
            if (searchAlbumList == null || searchAlbumList.getAlbums() == null || searchAlbumList.getAlbums().size() == 0) {
                XimaSearchAllFragment.this.o = true;
                if (XimaSearchAllFragment.this.j == null) {
                    return;
                } else {
                    XimaSearchAllFragment.this.j.showNoSearchResult(XimaSearchAllFragment.this.o, XimaSearchAllFragment.this.n);
                }
            } else {
                if (XimaSearchAllFragment.this.m == null) {
                    XimaSearchAllFragment.this.m = searchAlbumList;
                } else {
                    XimaSearchAllFragment.this.m.getAlbums().addAll(searchAlbumList.getAlbums());
                }
                if (XimaSearchAllFragment.this.g == null) {
                    return;
                }
                XimaSearchAllFragment.this.g.setVisibility(0);
                List<Album> albums = searchAlbumList.getAlbums();
                Iterator<Album> it2 = albums.iterator();
                while (it2.hasNext()) {
                    Log.d(XimaSearchAllFragment.p, it2.next().toString(), new Object[0]);
                }
                for (int i = 0; i < albums.size() && i <= 2; i++) {
                    AlbumItem albumItem = (AlbumItem) LayoutInflater.from(XimaSearchAllFragment.this.a).inflate(R.layout.album_item, (ViewGroup) null);
                    Album album = albums.get(i);
                    albumItem.displayData(album);
                    albumItem.setOnClickListener(new ViewOnClickListenerC0664a(album));
                    XimaSearchAllFragment.this.g.addView(albumItem);
                }
            }
            XimaSearchAllFragment.this.e = false;
        }

        @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
        public void onError(int i, String str) {
            Log.d(XimaSearchAllFragment.p, "edittext onerror reason is " + str, new Object[0]);
            XimaSearchAllFragment.this.e = false;
        }
    }

    public class b implements IDataCallBack<SearchTrackList> {

        public class a implements View.OnClickListener {
            public final /* synthetic */ SoundItem a;

            public a(SoundItem soundItem) {
                this.a = soundItem;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Analytics.event(XimaSearchAllFragment.this.j, AnalyticsEvents.EVENT_CLICK_DOWNLOAD_SEARCH_SOUND);
                if (!DeviceManager.getManager(XimaSearchAllFragment.this.a).isBoundDeviceConnected()) {
                    XimalayaUtils.showChanelDialog(XimaSearchAllFragment.this.j);
                    return;
                }
                Track data = this.a.getData();
                this.a.changeDownState();
                XimalayaUtils.sendDownLoadCommand(XimalayaUtils.tracksToJsonList(data));
            }
        }

        public b() {
        }

        @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(SearchTrackList searchTrackList) {
            if (XimaSearchAllFragment.this.b) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onSuccess ");
            sb.append(searchTrackList != null);
            Log.d(XimaSearchAllFragment.p, sb.toString(), new Object[0]);
            if (searchTrackList == null || searchTrackList.getTracks() == null || searchTrackList.getTracks().size() == 0) {
                XimaSearchAllFragment.this.n = true;
                if (XimaSearchAllFragment.this.j == null) {
                    return;
                } else {
                    XimaSearchAllFragment.this.j.showNoSearchResult(XimaSearchAllFragment.this.o, XimaSearchAllFragment.this.n);
                }
            } else {
                if (XimaSearchAllFragment.this.l == null) {
                    XimaSearchAllFragment.this.l = searchTrackList;
                } else {
                    XimaSearchAllFragment.this.l.getTracks().addAll(searchTrackList.getTracks());
                }
                if (XimaSearchAllFragment.this.h == null || XimaSearchAllFragment.this.i == null) {
                    return;
                }
                XimaSearchAllFragment.this.h.setVisibility(0);
                XimaSearchAllFragment.this.i.setVisibility(0);
                List<Track> tracks = XimaSearchAllFragment.this.l.getTracks();
                Iterator<Track> it2 = tracks.iterator();
                while (it2.hasNext()) {
                    Log.d(XimaSearchAllFragment.p, it2.next().toString(), new Object[0]);
                }
                for (int i = 0; i < tracks.size() && i <= 2; i++) {
                    SoundItem soundItem = (SoundItem) LayoutInflater.from(XimaSearchAllFragment.this.a).inflate(R.layout.sound_item, (ViewGroup) null);
                    soundItem.setData(tracks.get(i));
                    soundItem.setOnClickListener(new a(soundItem));
                    soundItem.displayData(XimaSearchAllFragment.this.a);
                    XimaSearchAllFragment.this.h.addView(soundItem);
                }
            }
            XimaSearchAllFragment.this.e = false;
        }

        @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
        public void onError(int i, String str) {
            Log.d(XimaSearchAllFragment.p, "edittext onerror reason is " + str, new Object[0]);
            XimaSearchAllFragment.this.e = false;
        }
    }

    public class c implements View.OnClickListener {
        private c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id = view.getId();
            if (id == R.id.more_album) {
                XimaSearchAllFragment.this.j.slidingSelectFragment(1);
            } else if (id == R.id.more_sound) {
                XimaSearchAllFragment.this.j.slidingSelectFragment(2);
            }
        }
    }

    private void p() {
        LinearLayout linearLayout = this.g;
        if (linearLayout != null) {
            for (int childCount = linearLayout.getChildCount() - 1; childCount > 0; childCount--) {
                this.g.removeViewAt(childCount);
            }
        }
        LinearLayout linearLayout2 = this.h;
        if (linearLayout2 != null) {
            for (int childCount2 = linearLayout2.getChildCount() - 1; childCount2 > 0; childCount2--) {
                this.h.removeViewAt(childCount2);
            }
        }
    }

    private boolean q() {
        TrackHotList trackHotList = this.d;
        return trackHotList == null || trackHotList.getTotalPage() > this.c;
    }

    public void loadData(String str) {
        loadData(str, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        Log.i(p, "onActivityCreated", new Object[0]);
        super.onActivityCreated(bundle);
        this.b = false;
        this.a = getActivity();
        this.f = CommonRequest.getInstanse();
        if (getActivity() instanceof XimalayaSearchingActivity) {
            XimalayaSearchingActivity ximalayaSearchingActivity = (XimalayaSearchingActivity) getActivity();
            this.j = ximalayaSearchingActivity;
            this.k = ximalayaSearchingActivity.getSeachString();
        }
        loadData(this.k);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreate(bundle);
        CommonRequest.getInstanse().setDefaultPagesize(3);
        View viewInflate = layoutInflater.inflate(R.layout.fragment_xima_search_all, viewGroup, false);
        this.g = (LinearLayout) viewInflate.findViewById(R.id.searching_result_album);
        this.h = (LinearLayout) viewInflate.findViewById(R.id.searching_result_sound);
        c cVar = new c();
        TextView textView = (TextView) viewInflate.findViewById(R.id.more_album);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.more_sound);
        this.i = viewInflate.findViewById(R.id.divider);
        textView.setOnClickListener(cVar);
        textView2.setOnClickListener(cVar);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        Log.i(p, "onDestroyView", new Object[0]);
        this.b = true;
        super.onDestroyView();
    }

    public void refresh() {
        Log.d(p, "---refresh", new Object[0]);
        if (q()) {
            loadData(this.k);
        }
    }

    public void setResource(String str) {
        this.k = str;
    }

    public void loadData(String str, boolean z) {
        if (this.e || str == null || this.b) {
            return;
        }
        this.e = true;
        if (z) {
            this.m = null;
            this.l = null;
            this.c = 1;
        }
        p();
        HashMap map = new HashMap();
        map.put(DTransferConstants.SEARCH_KEY, str);
        map.put(DTransferConstants.PAGE, "" + this.c);
        map.put(DTransferConstants.CALC_DIMENSION, "3");
        CommonRequest.getSearchedAlbums(map, new a());
        CommonRequest.getSearchedTracks(map, new b());
    }
}
