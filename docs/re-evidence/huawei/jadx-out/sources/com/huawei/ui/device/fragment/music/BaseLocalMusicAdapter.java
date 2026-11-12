package com.huawei.ui.device.fragment.music;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.ImageView;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicSong;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.device.R;
import com.huawei.ui.device.activity.music.LocalMusicResourceActivity;
import defpackage.njy;
import defpackage.rdd;
import defpackage.rfv;
import defpackage.rfw;
import defpackage.rfx;
import defpackage.rga;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class BaseLocalMusicAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f24903a;
    private ArrayList<MusicSong> d;
    private List<MusicSong> e;
    private boolean[] f;
    private boolean[] g;
    private int n;
    private String o;
    private List<MusicSong> l = new ArrayList(16);
    private int j = 0;
    private HashMap<String, ArrayList<MusicSong>> k = new HashMap<>(16);
    private ArrayList<rfx> m = new ArrayList<>(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap<String, ArrayList<MusicSong>> f24904b = new HashMap<>(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<rfw> f24905c = new ArrayList<>(16);
    private HashMap<String, ArrayList<MusicSong>> h = new HashMap<>(16);
    private ArrayList<rfv> i = new ArrayList<>(16);

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 4;
    }

    public BaseLocalMusicAdapter(Context context, List<MusicSong> list, List<MusicSong> list2) {
        this.f24903a = context;
        this.e = list2;
        a(list);
        this.d = rdd.d().b();
    }

    private void a(final List<MusicSong> list) {
        if (list != null) {
            this.l = list;
            int size = list.size();
            this.j = size;
            this.f = new boolean[size];
            this.g = new boolean[size];
            if (this.e == null) {
                return;
            }
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.device.fragment.music.BaseLocalMusicAdapter.5
                @Override // java.lang.Runnable
                public void run() {
                    for (int i = 0; i < BaseLocalMusicAdapter.this.j; i++) {
                        MusicSong musicSong = (MusicSong) list.get(i);
                        if (musicSong != null) {
                            BaseLocalMusicAdapter.this.e(musicSong, i);
                        }
                    }
                    int length = BaseLocalMusicAdapter.this.g.length;
                    LogUtil.a("BaseLocalMusicAdapter", "initList, mIsAddedFlags size:", Integer.valueOf(length), " , ", Arrays.toString(BaseLocalMusicAdapter.this.g));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(MusicSong musicSong, int i) {
        for (MusicSong musicSong2 : this.e) {
            if (musicSong2.getSongName() != null && musicSong2.getSongName().equals(musicSong.getSongName())) {
                if (musicSong2.getSongSingerName() != null) {
                    if (musicSong2.getSongSingerName().equals(musicSong.getSongSingerName())) {
                        b(true, i);
                    }
                } else {
                    b(true, i);
                }
            }
        }
    }

    private void b(boolean z, int i) {
        boolean[] zArr = this.g;
        if (i >= zArr.length) {
            return;
        }
        zArr[i] = z;
    }

    public List<MusicSong> e() {
        ArrayList arrayList = new ArrayList();
        if (!njy.e(this.l) && this.l.size() <= this.g.length) {
            for (int i = 0; i < this.l.size(); i++) {
                if (!this.g[i]) {
                    arrayList.add(this.l.get(i));
                    LogUtil.a("BaseLocalMusicAdapter", "getNonAddedSongList, name:", this.l.get(i).getSongName(), "singer:", this.l.get(i).getSongSingerName());
                }
            }
        }
        return arrayList;
    }

    public boolean[] d() {
        boolean[] zArr = this.g;
        return zArr == null ? new boolean[0] : zArr;
    }

    public boolean[] a() {
        boolean[] zArr = this.f;
        return zArr == null ? new boolean[0] : zArr;
    }

    protected void c(List<MusicSong> list) {
        if (list == null) {
            LogUtil.j("BaseLocalMusicAdapter", "dataLists is null.");
            return;
        }
        LogUtil.a("BaseLocalMusicAdapter", "mItemType : " + this.n, "dataLists :" + list.size(), "mSortType :" + this.o);
        if (MusicSong.SORT_TYPE_SINGER.equals(this.o) && this.n == 1) {
            this.m.clear();
            this.k.clear();
            d(list);
            Collections.sort(this.m, rfx.a());
        } else if (MusicSong.SORT_TYPE_ALBUM.equals(this.o) && this.n == 2) {
            this.f24905c.clear();
            this.f24904b.clear();
            e(list);
            Collections.sort(this.f24905c, rfw.a());
        } else if (MusicSong.SORT_TYPE_FOLDER.equals(this.o) && this.n == 3) {
            this.i.clear();
            this.h.clear();
            b(list);
            Collections.sort(this.i, rfv.a());
        } else {
            Collections.sort(list, MusicSong.getSortByNameInstance());
        }
        this.l = list;
        if (this.n == 0) {
            if (this.d != null) {
                j(list);
            }
            if (this.e != null) {
                g(list);
            }
        }
    }

    private List<rfx> d(List<MusicSong> list) {
        for (MusicSong musicSong : list) {
            String strA = rga.a(this.f24903a, musicSong);
            if (TextUtils.isEmpty(strA)) {
                break;
            }
            if (this.k.containsKey(strA)) {
                this.k.get(strA).add(musicSong);
            } else {
                ArrayList<MusicSong> arrayList = new ArrayList<>(16);
                arrayList.add(musicSong);
                this.k.put(strA, arrayList);
            }
        }
        for (Map.Entry<String, ArrayList<MusicSong>> entry : this.k.entrySet()) {
            rfx rfxVar = new rfx();
            rfxVar.e(entry.getKey());
            rfxVar.b(entry.getValue());
            this.m.add(rfxVar);
        }
        return this.m;
    }

    private List<rfw> e(List<MusicSong> list) {
        for (MusicSong musicSong : list) {
            String albumName = musicSong.getAlbumName();
            if (TextUtils.isEmpty(albumName)) {
                break;
            }
            if (this.f24904b.containsKey(albumName)) {
                this.f24904b.get(albumName).add(musicSong);
            } else {
                ArrayList<MusicSong> arrayList = new ArrayList<>(16);
                arrayList.add(musicSong);
                this.f24904b.put(albumName, arrayList);
            }
        }
        for (Map.Entry<String, ArrayList<MusicSong>> entry : this.f24904b.entrySet()) {
            rfw rfwVar = new rfw();
            rfwVar.a(entry.getKey());
            rfwVar.d(entry.getValue());
            this.f24905c.add(rfwVar);
        }
        return this.f24905c;
    }

    private List<rfv> b(List<MusicSong> list) {
        for (MusicSong musicSong : list) {
            String songFilePath = musicSong.getSongFilePath();
            if (TextUtils.isEmpty(songFilePath)) {
                break;
            }
            int iLastIndexOf = musicSong.getSongFilePath().lastIndexOf("/");
            if (iLastIndexOf > 0) {
                songFilePath = musicSong.getSongFilePath().substring(0, iLastIndexOf);
            }
            if (this.h.containsKey(songFilePath)) {
                this.h.get(songFilePath).add(musicSong);
            } else {
                ArrayList<MusicSong> arrayList = new ArrayList<>(16);
                arrayList.add(musicSong);
                this.h.put(songFilePath, arrayList);
            }
        }
        for (Map.Entry<String, ArrayList<MusicSong>> entry : this.h.entrySet()) {
            rfv rfvVar = new rfv();
            rfvVar.c(entry.getKey());
            rfvVar.c(entry.getValue());
            this.i.add(rfvVar);
        }
        return this.i;
    }

    private void j(List list) {
        if (list == null) {
            return;
        }
        int size = list.size();
        this.j = size;
        this.f = new boolean[size];
        MusicSong musicSong = null;
        for (int i = 0; i < this.d.size(); i++) {
            String songName = this.d.get(i).getSongName();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Object obj = list.get(i2);
                if (obj instanceof MusicSong) {
                    musicSong = (MusicSong) obj;
                }
                if (musicSong != null && songName.equals(musicSong.getSongName())) {
                    this.f[i2] = true;
                }
            }
        }
        boolean[] zArr = this.f;
        LogUtil.a("BaseLocalMusicAdapter", "processCheckedSongs, size:", Integer.valueOf(zArr.length), " , mIsCheckedFlags:", Arrays.toString(zArr));
    }

    private void g(final List list) {
        if (list == null) {
            return;
        }
        this.g = new boolean[list.size()];
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.device.fragment.music.BaseLocalMusicAdapter.2
            @Override // java.lang.Runnable
            public void run() {
                for (int i = 0; i < list.size(); i++) {
                    Object obj = list.get(i);
                    if (obj instanceof MusicSong) {
                        BaseLocalMusicAdapter.this.e((MusicSong) obj, i);
                    }
                }
                int length = BaseLocalMusicAdapter.this.g.length;
                LogUtil.a("BaseLocalMusicAdapter", "processAddedSongsFromPre, mIsAddedFlags:", Integer.valueOf(length), " , ", Arrays.toString(BaseLocalMusicAdapter.this.g));
            }
        });
    }

    public void i() {
        if (this.d == null) {
            return;
        }
        j(this.l);
    }

    public int a(String str) {
        List<MusicSong> list = this.l;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < this.l.size(); i++) {
            if (this.l.get(i).getFirstLetter(this.o).equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public int c(String str) {
        ArrayList<rfx> arrayList = this.m;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < this.m.size(); i++) {
            if (this.m.get(i).e().equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public int d(String str) {
        ArrayList<rfw> arrayList = this.f24905c;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < this.f24905c.size(); i++) {
            if (this.f24905c.get(i).c().equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public int b(String str) {
        ArrayList<rfv> arrayList = this.i;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < this.i.size(); i++) {
            if (this.i.get(i).c().equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public void e(String str) {
        this.o = str;
    }

    public void d(int i) {
        this.n = i;
    }

    public int c() {
        return this.n;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        int i = this.n;
        if (i == 0) {
            return this.l.size();
        }
        if (i == 1) {
            return this.m.size();
        }
        if (i == 2) {
            return this.f24905c.size();
        }
        return this.i.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (i < 0 || i >= getCount()) {
            LogUtil.e("BaseLocalMusicAdapter", "getItem position is wrong");
            return new Object();
        }
        int i2 = this.n;
        if (i2 == 0) {
            return this.l.get(i);
        }
        if (i2 == 1) {
            return this.m.get(i).d();
        }
        if (i2 == 2) {
            return this.f24905c.get(i).b();
        }
        return this.i.get(i).d();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        int i2 = this.n;
        if (i2 == 0) {
            return 0;
        }
        if (i2 == 1) {
            return 1;
        }
        return i2 == 2 ? 2 : 3;
    }

    public ArrayList<MusicSong> b() {
        return this.d;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        return c(i, view);
    }

    private View c(int i, View view) {
        View viewInflate;
        d dVar;
        b bVar;
        int itemViewType = getItemViewType(i);
        d dVar2 = null;
        if (view == null) {
            if (itemViewType == 0) {
                b bVar2 = new b();
                View viewInflate2 = LayoutInflater.from(this.f24903a).inflate(R.layout.activity_music_song_list_item, (ViewGroup) null);
                bVar2.d = (HealthTextView) viewInflate2.findViewById(R.id.music_song_name_tv);
                bVar2.f24913b = (HealthTextView) viewInflate2.findViewById(R.id.music_song_singer_tv);
                bVar2.e = (ImageView) viewInflate2.findViewById(R.id.imageview_more_or_select);
                bVar2.f24912a = (HealthCheckBox) viewInflate2.findViewById(R.id.cb_more_or_select);
                bVar2.f24914c = (ImageView) viewInflate2.findViewById(R.id.under_line);
                viewInflate2.setTag(bVar2);
                bVar = bVar2;
                view = viewInflate2;
            } else if (itemViewType != 1 && itemViewType != 2 && itemViewType != 3) {
                LogUtil.a("BaseLocalMusicAdapter", "other types!");
                bVar = null;
            } else {
                dVar = new d();
                viewInflate = LayoutInflater.from(this.f24903a).inflate(R.layout.item_music_singer_list_item, (ViewGroup) null);
                dVar.f24915a = (HealthTextView) viewInflate.findViewById(R.id.hw_music_singer_name_tv);
                dVar.d = (HealthTextView) viewInflate.findViewById(R.id.hw_music_singer_count);
                dVar.f24916c = (ImageView) viewInflate.findViewById(R.id.under_line);
                viewInflate.setTag(dVar);
                dVar2 = dVar;
                view = viewInflate;
                bVar = null;
            }
        } else if (itemViewType == 1 || itemViewType == 2 || itemViewType == 3) {
            viewInflate = view;
            dVar = (d) view.getTag();
            dVar2 = dVar;
            view = viewInflate;
            bVar = null;
        } else if (itemViewType != 0 || !(view.getTag() instanceof b)) {
            LogUtil.j("BaseLocalMusicAdapter", "other types!");
            bVar = null;
        } else {
            bVar = (b) view.getTag();
        }
        e(view, dVar2, bVar, i);
        return view;
    }

    private void e(View view, d dVar, b bVar, int i) {
        if (i < 0 || i >= getCount()) {
            LogUtil.e("BaseLocalMusicAdapter", "setData position is wrong");
            return;
        }
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0) {
            b(view, bVar, i);
            return;
        }
        if (itemViewType == 1) {
            c(dVar, i);
        } else if (itemViewType == 2) {
            b(dVar, i);
        } else {
            if (itemViewType != 3) {
                return;
            }
            d(dVar, i);
        }
    }

    private void b(d dVar) {
        if (CommonUtil.at()) {
            dVar.f24916c.setVisibility(8);
        } else {
            dVar.f24916c.setVisibility(0);
        }
    }

    private void d(d dVar, int i) {
        if (dVar == null) {
            LogUtil.j("BaseLocalMusicAdapter", "setSingerData, viewHolder is null");
            return;
        }
        dVar.f24915a.setText(this.i.get(i).e());
        dVar.d.setText(this.f24903a.getResources().getQuantityString(R.plurals.IDS_settings_music_songs_num, 0, Integer.valueOf(this.i.get(i).d().size())));
        if (this.i.size() - 1 == i) {
            dVar.f24916c.setVisibility(8);
        } else {
            b(dVar);
        }
    }

    private void b(d dVar, int i) {
        if (dVar == null) {
            LogUtil.j("BaseLocalMusicAdapter", "setSingerData, viewHolder is null");
            return;
        }
        if (this.f24905c.get(i) != null) {
            dVar.f24915a.setText(this.f24905c.get(i).d());
        }
        int size = this.f24905c.get(i).b().size();
        dVar.d.setText(this.f24903a.getResources().getQuantityString(R.plurals.IDS_settings_music_songs_num, size, Integer.valueOf(size)));
        if (this.f24905c.size() - 1 == i) {
            dVar.f24916c.setVisibility(8);
        } else {
            b(dVar);
        }
    }

    private void c(d dVar, int i) {
        if (dVar == null) {
            LogUtil.j("BaseLocalMusicAdapter", "setSingerData, viewHolder is null");
            return;
        }
        dVar.f24915a.setText(this.m.get(i).c());
        dVar.d.setText(this.f24903a.getResources().getQuantityString(R.plurals.IDS_settings_music_songs_num, 0, Integer.valueOf(this.m.get(i).d().size())));
        if (this.m.size() - 1 == i) {
            dVar.f24916c.setVisibility(8);
        } else {
            b(dVar);
        }
    }

    private void b(View view, b bVar, int i) {
        if (bVar == null) {
            LogUtil.j("BaseLocalMusicAdapter", "viewHolderDetail is null");
            return;
        }
        bVar.d.setText(this.l.get(i).getSongName());
        bVar.f24913b.setText(rga.a(this.f24903a, this.l.get(i)));
        bVar.e.setVisibility(8);
        bVar.f24912a.setVisibility(0);
        if (this.l.size() - 1 == i || CommonUtil.at()) {
            bVar.f24914c.setVisibility(8);
        } else {
            bVar.f24914c.setVisibility(0);
        }
        bVar.f24912a.setFocusable(false);
        a(view, bVar, i);
    }

    private void a(View view, final b bVar, final int i) {
        LogUtil.a("BaseLocalMusicAdapter", "enter changeCheckBoxStatus");
        boolean[] zArr = this.g;
        if (zArr == null || i < 0 || i >= zArr.length) {
            return;
        }
        final boolean z = zArr[i];
        bVar.f24912a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.device.fragment.music.BaseLocalMusicAdapter.4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                LogUtil.a("BaseLocalMusicAdapter", "CheckedChanged position:", Integer.valueOf(i), " ,isChecked:", Boolean.valueOf(z2));
                BaseLocalMusicAdapter.this.c(z2, z, i);
            }
        });
        if (z) {
            bVar.f24912a.setChecked(true);
        }
        bVar.f24912a.setChecked(this.f[i]);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.fragment.music.BaseLocalMusicAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                LogUtil.a("BaseLocalMusicAdapter", "isAddedFlag:", Boolean.valueOf(z), ",Click position:", Integer.valueOf(i), " ,mSelectCheckBox checked:", Boolean.valueOf(bVar.f24912a.isChecked()));
                if (BaseLocalMusicAdapter.this.f == null || BaseLocalMusicAdapter.this.f.length <= i) {
                    LogUtil.j("BaseLocalMusicAdapter", "Illegal position out of bounds");
                } else {
                    LogUtil.a("BaseLocalMusicAdapter", "checkedFlag:", Boolean.valueOf(BaseLocalMusicAdapter.this.f[i]));
                }
                if (z) {
                    return;
                }
                bVar.f24912a.setChecked(!bVar.f24912a.isChecked());
            }
        });
        c(bVar, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z, boolean z2, int i) {
        a(z, z2, i);
        boolean zJ = false;
        boolean[] zArr = this.g;
        if (zArr.length == this.f.length && zArr.length > 0) {
            zJ = j();
        }
        if (this.o.equals(((LocalMusicResourceActivity) this.f24903a).e())) {
            Context context = this.f24903a;
            if (context instanceof LocalMusicResourceActivity) {
                ((LocalMusicResourceActivity) context).e(this.d.size(), zJ);
            }
        }
    }

    private void a(boolean z, boolean z2, int i) {
        List<MusicSong> list;
        if (!z2) {
            boolean[] zArr = this.f;
            if (zArr == null || i < 0 || i >= zArr.length) {
                LogUtil.j("BaseLocalMusicAdapter", "position is ArrayIndexOutOfBoundsException");
                return;
            }
            zArr[i] = z;
        }
        if (!z) {
            if (z2 || (list = this.l) == null || i >= list.size()) {
                return;
            }
            this.d.remove(this.l.get(i));
            return;
        }
        List<MusicSong> list2 = this.l;
        if (list2 == null || i >= list2.size() || z2 || this.d.contains(this.l.get(i))) {
            return;
        }
        this.d.add(this.l.get(i));
    }

    private Boolean j() {
        int i = 0;
        while (true) {
            boolean[] zArr = this.g;
            if (i < zArr.length) {
                if (!zArr[i] && !this.f[i]) {
                    return false;
                }
                i++;
            } else {
                return true;
            }
        }
    }

    private void c(b bVar, int i) {
        if (this.g[i]) {
            bVar.f24912a.setChecked(true);
            bVar.f24912a.setEnabled(false);
            bVar.f24912a.setOnCheckedChangeListener(null);
            return;
        }
        bVar.f24912a.setEnabled(true);
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f24915a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ImageView f24916c;
        HealthTextView d;

        d() {
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthCheckBox f24912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f24913b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ImageView f24914c;
        HealthTextView d;
        ImageView e;

        b() {
        }
    }
}
