package com.huami.watch.companion.ximalaya;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.Glide;
import com.huami.watch.companion.R;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.util.AnalyticsEvents;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.Log;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest;
import com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack;
import com.ximalaya.ting.android.opensdk.model.track.SearchTrackList;
import com.ximalaya.ting.android.opensdk.model.track.Track;
import com.ximalaya.ting.android.opensdk.model.track.TrackHotList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class XimaSearchSoundFragment extends Fragment {
    private static final String o = "XimaCategoryDetailFragment";
    private Context a;
    private ListView b;
    private TrackAdapter c;
    private CommonRequest h;
    private TextView i;
    private View j;
    private int k;
    private XimalayaSearchingActivity l;
    private int d = 1;
    private TrackHotList e = null;
    private boolean f = false;
    private List<Boolean> g = new ArrayList();
    private SearchTrackList m = null;
    private String n = null;

    public class TrackAdapter extends BaseAdapter {
        public TrackAdapter() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (XimaSearchSoundFragment.this.m == null || XimaSearchSoundFragment.this.m.getTracks() == null) {
                return 0;
            }
            Log.d(XimaSearchSoundFragment.o, "size is " + XimaSearchSoundFragment.this.m.getTracks().size(), new Object[0]);
            return XimaSearchSoundFragment.this.m.getTracks().size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return XimaSearchSoundFragment.this.m.getTracks().get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            ViewHolder viewHolder;
            if (view == null) {
                view = LayoutInflater.from(XimaSearchSoundFragment.this.a).inflate(R.layout.sound_item, viewGroup, false);
                viewHolder = new ViewHolder();
                viewHolder.content = (ViewGroup) view;
                viewHolder.cover = (ImageView) view.findViewById(R.id.item_icon);
                viewHolder.title = (TextView) view.findViewById(R.id.item_title);
                viewHolder.author = (TextView) view.findViewById(R.id.item_author);
                viewHolder.size = (TextView) view.findViewById(R.id.item_size);
                viewHolder.time = (TextView) view.findViewById(R.id.item_time);
                viewHolder.downloadStatue = (ImageView) view.findViewById(R.id.item_download_ig);
                view.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) view.getTag();
            }
            Track track = XimaSearchSoundFragment.this.m.getTracks().get(i);
            viewHolder.title.setText(track.getTrackTitle());
            viewHolder.author.setText(XimaSearchSoundFragment.this.a.getString(R.string.xima_album_author, track.getAnnouncer().getNickname()));
            viewHolder.size.setText(String.valueOf(track.getPlaySize64()));
            viewHolder.time.setText(XimalayaUtils.getAlbumTime(track.getDuration()));
            Log.d(XimaSearchSoundFragment.o, "title is " + track.getTrackTitle(), new Object[0]);
            Glide.with(XimaSearchSoundFragment.this).load(track.getCoverUrlSmall()).into(viewHolder.cover);
            viewHolder.content.setBackgroundColor(-1);
            viewHolder.downloadStatue.setBackgroundResource(((Boolean) XimaSearchSoundFragment.this.g.get(i)).booleanValue() ? R.drawable.download_p : R.drawable.download);
            return view;
        }
    }

    public class a implements IDataCallBack<SearchTrackList> {
        public final /* synthetic */ boolean a;

        public a(boolean z) {
            this.a = z;
        }

        @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(SearchTrackList searchTrackList) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSuccess ");
            sb.append(searchTrackList != null);
            Log.d(XimaSearchSoundFragment.o, sb.toString(), new Object[0]);
            if (searchTrackList != null && searchTrackList.getTracks() != null && searchTrackList.getTracks().size() != 0) {
                XimaSearchSoundFragment.this.d++;
                if (XimaSearchSoundFragment.this.m == null) {
                    XimaSearchSoundFragment.this.m = searchTrackList;
                } else {
                    XimaSearchSoundFragment.this.m.getTracks().addAll(searchTrackList.getTracks());
                }
                List<Track> tracks = XimaSearchSoundFragment.this.m.getTracks();
                if (this.a) {
                    XimaSearchSoundFragment.this.g.clear();
                }
                for (int i = 0; i < tracks.size(); i++) {
                    if (i >= XimaSearchSoundFragment.this.g.size()) {
                        XimaSearchSoundFragment.this.g.add(Boolean.FALSE);
                    }
                }
                Iterator<Track> it2 = tracks.iterator();
                while (it2.hasNext()) {
                    Log.d(XimaSearchSoundFragment.o, "edittext result is " + it2.next().toString(), new Object[0]);
                }
                XimaSearchSoundFragment.this.q();
                if (XimaSearchSoundFragment.this.c == null) {
                    return;
                }
                XimaSearchSoundFragment.this.c.notifyDataSetChanged();
                XimaSearchSoundFragment.this.t();
            } else if (XimaSearchSoundFragment.this.d == 1) {
                XimaSearchSoundFragment.this.s();
            }
            XimaSearchSoundFragment.this.f = false;
        }

        @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
        public void onError(int i, String str) {
            Log.d(XimaSearchSoundFragment.o, "edittext onerror reason is " + str, new Object[0]);
            XimaSearchSoundFragment.this.s();
            XimaSearchSoundFragment.this.f = false;
        }
    }

    public class b implements AdapterView.OnItemClickListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Analytics.event(XimaSearchSoundFragment.this.l, AnalyticsEvents.EVENT_CLICK_DOWNLOAD_SEARCH_SOUND);
            if (i >= XimaSearchSoundFragment.this.m.getTracks().size()) {
                return;
            }
            DeviceManager manager = DeviceManager.getManager(XimaSearchSoundFragment.this.a);
            Track track = XimaSearchSoundFragment.this.m.getTracks().get(i);
            if (!manager.isBoundDeviceConnected()) {
                XimalayaUtils.showChanelDialog(XimaSearchSoundFragment.this.l);
            } else if (track != null) {
                ImageView imageView = (ImageView) view.findViewById(R.id.item_download_ig);
                XimaSearchSoundFragment.this.g.set(i, Boolean.valueOf(!((Boolean) XimaSearchSoundFragment.this.g.get(i)).booleanValue()));
                imageView.setBackgroundResource(((Boolean) XimaSearchSoundFragment.this.g.get(i)).booleanValue() ? R.drawable.download_p : R.drawable.download);
                XimalayaUtils.sendDownLoadCommand(XimalayaUtils.tracksToJsonList(track));
            }
        }
    }

    public class c implements AbsListView.OnScrollListener {
        public c() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 0) {
                int count = absListView.getCount();
                int i2 = count - 5;
                if (i2 <= 0) {
                    i2 = count - 1;
                }
                if (absListView.getLastVisiblePosition() > i2) {
                    if (XimaSearchSoundFragment.this.e == null || XimaSearchSoundFragment.this.d <= XimaSearchSoundFragment.this.e.getTotalPage()) {
                        XimaSearchSoundFragment.this.r();
                        XimaSearchSoundFragment ximaSearchSoundFragment = XimaSearchSoundFragment.this;
                        ximaSearchSoundFragment.loadData(ximaSearchSoundFragment.n);
                    }
                }
            }
        }
    }

    private boolean p() {
        TrackHotList trackHotList = this.e;
        return trackHotList == null || trackHotList.getTotalPage() > this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        View view = this.j;
        if (view != null) {
            view.setPadding(0, 0, 0, -this.k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        View view = this.j;
        if (view != null) {
            view.setPadding(0, 0, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        TextView textView = this.i;
        if (textView == null || this.b == null) {
            return;
        }
        textView.setVisibility(0);
        this.b.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        TextView textView = this.i;
        if (textView == null || this.b == null) {
            return;
        }
        textView.setVisibility(8);
        this.b.setVisibility(0);
    }

    public void addFootView() {
        if (getContext() != null) {
            try {
                if (this.j != null || getContext() == null) {
                    this.j.setPadding(0, 0, 0, -this.k);
                    this.b.addFooterView(this.j);
                } else {
                    View viewInflate = View.inflate(getContext(), R.layout.footview_loadmore, null);
                    this.j = viewInflate;
                    viewInflate.measure(0, 0);
                    this.k = this.j.getMeasuredHeight();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void deleteFootView() {
        View view;
        ListView listView = this.b;
        if (listView == null || (view = this.j) == null) {
            return;
        }
        listView.removeFooterView(view);
    }

    public void loadData(String str) {
        loadData(str, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        Log.i(o, "onActivityCreated", new Object[0]);
        super.onActivityCreated(bundle);
        this.a = getActivity();
        this.h = CommonRequest.getInstanse();
        if (getActivity() instanceof XimalayaSearchingActivity) {
            XimalayaSearchingActivity ximalayaSearchingActivity = (XimalayaSearchingActivity) getActivity();
            this.l = ximalayaSearchingActivity;
            this.n = ximalayaSearchingActivity.getSeachString();
        }
        loadData(this.n);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreate(bundle);
        CommonRequest.getInstanse().setDefaultPagesize(20);
        View viewInflate = layoutInflater.inflate(R.layout.fragment_xima_search_sound, viewGroup, false);
        this.b = (ListView) viewInflate.findViewById(R.id.search_sound);
        this.c = new TrackAdapter();
        addFootView();
        this.b.setAdapter((ListAdapter) this.c);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setOnItemClickListener(new b());
        this.b.setOnScrollListener(new c());
        this.i = (TextView) viewInflate.findViewById(R.id.nodata);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        Log.i(o, "onDestroyView", new Object[0]);
        super.onDestroyView();
    }

    public void refresh() {
        Log.d(o, "---refresh", new Object[0]);
        if (p()) {
            loadData(this.n);
        }
    }

    public void setResource(String str) {
        this.n = str;
    }

    public void loadData(String str, boolean z) {
        if (this.f || str == null) {
            return;
        }
        this.n = str;
        this.f = true;
        if (z) {
            this.m = null;
            this.d = 1;
        }
        HashMap map = new HashMap();
        map.put(DTransferConstants.SEARCH_KEY, str);
        map.put(DTransferConstants.PAGE, "" + this.d);
        map.put(DTransferConstants.CALC_DIMENSION, "3");
        CommonRequest.getSearchedTracks(map, new a(z));
    }
}
