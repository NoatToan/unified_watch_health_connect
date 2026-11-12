package com.huawei.ui.device.views.music;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicMenu;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicSong;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.OperationStruct;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.device.R;
import com.huawei.ui.device.activity.music.MusicMainActivity;
import com.huawei.ui.device.views.music.MusicSongsListAdapter;
import defpackage.idy;
import defpackage.lzl;
import defpackage.lzq;
import defpackage.lzu;
import defpackage.njy;
import defpackage.qop;
import defpackage.qpx;
import defpackage.rga;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class MusicSongsListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f25028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MusicMainActivity.j f25029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f25030c;
    private final LayoutInflater d;
    private boolean[] e;
    private boolean f;
    private List<MusicMenu> g;
    private List<MusicSong> i;

    public MusicSongsListAdapter(Context context, List<MusicSong> list, List<MusicMenu> list2) {
        this.i = new ArrayList(16);
        this.g = new ArrayList(16);
        HashMap map = new HashMap(16);
        this.f25030c = map;
        this.f = true;
        this.f25028a = context;
        map.put("click", "1");
        this.d = LayoutInflater.from(this.f25028a);
        ArrayList arrayList = new ArrayList(16);
        LogUtil.a("MusicMainActivity_MusicSongsListAdapter", "musicSongList size: ", Integer.valueOf(list.size()));
        arrayList.removeAll(list);
        arrayList.addAll(list);
        this.i = arrayList;
        this.g = list2;
        this.e = new boolean[arrayList.size()];
        Context context2 = this.f25028a;
        if (context2 instanceof MusicMainActivity) {
            this.f25029b = ((MusicMainActivity) context2).c();
        }
    }

    public void b(List<MusicSong> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.i.addAll(list);
        this.e = new boolean[this.i.size()];
    }

    public void e(MusicSong musicSong) {
        if (musicSong == null) {
            return;
        }
        this.i.remove(musicSong);
    }

    public boolean[] b() {
        boolean[] zArr = this.e;
        return zArr == null ? new boolean[0] : zArr;
    }

    public void a(boolean z) {
        this.f = z;
        notifyItemChanged(this.i.size());
    }

    public class SongViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthTextView f25049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ImageView f25050b;
        private View d;
        private HealthCheckBox e;
        private ImageView f;
        private HealthTextView g;

        public SongViewHolder(View view) {
            super(view);
            this.d = view;
            this.f25049a = (HealthTextView) view.findViewById(R.id.music_song_name_tv);
            this.g = (HealthTextView) view.findViewById(R.id.music_song_singer_tv);
            this.f25050b = (ImageView) view.findViewById(R.id.imageview_more_or_select);
            HealthCheckBox healthCheckBox = (HealthCheckBox) view.findViewById(R.id.cb_more_or_select);
            this.e = healthCheckBox;
            healthCheckBox.setClickable(false);
            this.f = (ImageView) view.findViewById(R.id.under_line);
            this.d.setVisibility(8);
        }

        public void e(final MusicSong musicSong, int i) {
            if (musicSong == null) {
                LogUtil.j("MusicMainActivity_MusicSongsListAdapter", "song is null.");
                this.d.setVisibility(8);
                return;
            }
            this.d.setVisibility(0);
            this.f25049a.setText(musicSong.getSongName());
            this.g.setText(rga.a(MusicSongsListAdapter.this.f25028a, musicSong));
            this.f25050b.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.views.music.MusicSongsListAdapter.SongViewHolder.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a("MusicMainActivity_MusicSongsListAdapter", "click  mMoreOperationImageView");
                    MusicSongsListAdapter.this.a(view, musicSong);
                }
            });
            this.f25050b.setVisibility(((MusicMainActivity) MusicSongsListAdapter.this.f25028a).g() ? 8 : 0);
            this.e.setVisibility(((MusicMainActivity) MusicSongsListAdapter.this.f25028a).g() ? 0 : 8);
            if (!((MusicMainActivity) MusicSongsListAdapter.this.f25028a).g()) {
                View view = this.itemView;
                MusicSongsListAdapter musicSongsListAdapter = MusicSongsListAdapter.this;
                view.setOnLongClickListener(musicSongsListAdapter.new a(i, musicSongsListAdapter.i));
            }
            if (MusicSongsListAdapter.this.e != null && i >= 0 && i < MusicSongsListAdapter.this.e.length) {
                this.e.setChecked(MusicSongsListAdapter.this.e[i]);
            }
            b(i, musicSong);
            if (MusicSongsListAdapter.this.i.size() - 1 == i) {
                this.f.setVisibility(8);
            } else {
                this.f.setVisibility(0);
            }
        }

        private void b(final int i, final MusicSong musicSong) {
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.views.music.MusicSongsListAdapter.SongViewHolder.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    int i2;
                    if (MusicSongsListAdapter.this.e == null || (i2 = i) < 0 || i2 >= MusicSongsListAdapter.this.e.length) {
                        return;
                    }
                    if (MusicSongsListAdapter.this.f25028a instanceof MusicMainActivity) {
                        if (((MusicMainActivity) MusicSongsListAdapter.this.f25028a).g()) {
                            if (MusicSongsListAdapter.this.e[i]) {
                                MusicSongsListAdapter.this.e[i] = false;
                                SongViewHolder.this.e.setChecked(false);
                                ((MusicMainActivity) MusicSongsListAdapter.this.f25028a).b().remove(musicSong);
                            } else if (((MusicMainActivity) MusicSongsListAdapter.this.f25028a).b().size() < 500) {
                                MusicSongsListAdapter.this.e[i] = true;
                                if (!((MusicMainActivity) MusicSongsListAdapter.this.f25028a).b().contains(MusicSongsListAdapter.this.i.get(i))) {
                                    ((MusicMainActivity) MusicSongsListAdapter.this.f25028a).b().add(musicSong);
                                }
                                SongViewHolder.this.e.setChecked(true);
                            } else {
                                qpx.b(MusicSongsListAdapter.this.f25028a, MusicSongsListAdapter.this.f25028a.getResources().getString(R.string.IDS_hw_music_limit_five_hundred));
                                return;
                            }
                            ((MusicMainActivity) MusicSongsListAdapter.this.f25028a).j();
                            return;
                        }
                        return;
                    }
                    LogUtil.j("MusicMainActivity_MusicSongsListAdapter", "mContext is not MusicMainActivity");
                }
            });
        }
    }

    public class LoadMoreViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthProgressBar f25047a;
        private HealthTextView d;

        public LoadMoreViewHolder(View view) {
            super(view);
            this.f25047a = (HealthProgressBar) view.findViewById(R.id.progressbar_load_more);
            this.d = (HealthTextView) view.findViewById(R.id.tv_load_more);
        }

        public void e() {
            if (MusicSongsListAdapter.this.f) {
                this.f25047a.setVisibility(0);
                this.d.setText(R.string.sug_his_loading_more);
            } else {
                this.f25047a.setVisibility(8);
                this.d.setText(R.string.sug_his_load_retry);
            }
            this.d.setOnClickListener(new View.OnClickListener() { // from class: rfz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f47284a.a(view);
                }
            });
        }

        public /* synthetic */ void a(View view) {
            if (MusicSongsListAdapter.this.f || lzu.c().i()) {
                LogUtil.a("MusicMainActivity_MusicSongsListAdapter", "LoadMoreViewHolder setData load more : reject");
                return;
            }
            this.f25047a.setVisibility(0);
            this.d.setText(R.string.sug_his_loading_more);
            if (MusicSongsListAdapter.this.f25029b != null) {
                MusicSongsListAdapter.this.f25029b.sendEmptyMessage(1015);
            }
        }
    }

    public List<MusicSong> d() {
        return this.i;
    }

    public void a(List<MusicSong> list) {
        this.i = list;
        e(list);
    }

    private void e(List list) {
        if (list == null) {
            return;
        }
        this.e = new boolean[list.size()];
        for (int i = 0; i < ((MusicMainActivity) this.f25028a).b().size(); i++) {
            String songName = ((MusicMainActivity) this.f25028a).b().get(i).getSongName();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Object obj = list.get(i2);
                if ((obj instanceof MusicSong) && songName.equals(((MusicSong) obj).getSongName())) {
                    this.e[i2] = true;
                }
            }
        }
    }

    class a implements View.OnLongClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f25055c;
        private List<MusicSong> e;

        a(int i, List<MusicSong> list) {
            this.f25055c = i;
            this.e = list;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            int i;
            int i2;
            MusicMainActivity musicMainActivity = (MusicMainActivity) MusicSongsListAdapter.this.f25028a;
            musicMainActivity.b().clear();
            List<MusicSong> list = this.e;
            if (list != null && (i2 = this.f25055c) >= 0 && i2 < list.size()) {
                musicMainActivity.b().add(this.e.get(this.f25055c));
            }
            musicMainActivity.c(true);
            musicMainActivity.d(8);
            if (this.e != null) {
                for (int i3 = 0; i3 < this.e.size(); i3++) {
                    musicMainActivity.a().put(i3, 0);
                }
            }
            if (MusicSongsListAdapter.this.e != null && (i = this.f25055c) >= 0 && i < MusicSongsListAdapter.this.e.length) {
                MusicSongsListAdapter.this.e[this.f25055c] = true;
            }
            MusicSongsListAdapter.this.notifyDataSetChanged();
            idy.b(AnalyticsValue.HEALTH_MUSIC_HOME_LONG_CLICK_1090085.value(), MusicSongsListAdapter.this.f25030c);
            return true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.i == null) {
            return 0;
        }
        if (!lzu.c().e()) {
            return this.i.size();
        }
        return this.i.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (lzu.c().e() && njy.b(this.i) && i == this.i.size()) {
            LogUtil.d("MusicMainActivity_MusicSongsListAdapter", "getItemViewType, View Type is VIEW_TYPE_LOAD_MORE");
            return 1;
        }
        return super.getItemViewType(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LogUtil.a("MusicMainActivity_MusicSongsListAdapter", "onCreateViewHolder viewType : ", Integer.valueOf(i));
        if (i == 1) {
            return new LoadMoreViewHolder(this.d.inflate(R.layout.item_music_load_more, viewGroup, false));
        }
        return new SongViewHolder(this.d.inflate(R.layout.activity_music_song_list_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        LogUtil.a("MusicMainActivity_MusicSongsListAdapter", "onBindViewHolder position : ", Integer.valueOf(i));
        if (this.i.isEmpty()) {
            LogUtil.j("MusicMainActivity_MusicSongsListAdapter", "onBindViewHolder mList is empty");
            return;
        }
        if (viewHolder instanceof SongViewHolder) {
            if (i < 0 || i >= this.i.size()) {
                return;
            }
            ((SongViewHolder) viewHolder).e(this.i.get(i), i);
            return;
        }
        if (viewHolder instanceof LoadMoreViewHolder) {
            ((LoadMoreViewHolder) viewHolder).e();
        } else {
            LogUtil.j("MusicMainActivity_MusicSongsListAdapter", "onBindViewHolder others");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, final MusicSong musicSong) {
        LogUtil.a("MusicMainActivity_MusicSongsListAdapter", "showPopMenu");
        View viewInflate = LayoutInflater.from(this.f25028a).inflate(R.layout.popview_mainactivity_songsitem_more_operation, (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.move_song_to_menu_rl);
        if (lzq.d()) {
            relativeLayout.setVisibility(8);
        }
        final qop qopVar = new qop(this.f25028a, viewInflate);
        qopVar.e(view, 0);
        final MusicMainActivity musicMainActivity = (MusicMainActivity) this.f25028a;
        viewInflate.findViewById(R.id.move_song_to_menu_rl).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.views.music.MusicSongsListAdapter.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (musicMainActivity.e() != 2) {
                    MusicSongsListAdapter.this.e();
                    return;
                }
                qop qopVar2 = qopVar;
                if (qopVar2 != null) {
                    qopVar2.e();
                }
                if (MusicSongsListAdapter.this.g.size() > 0) {
                    MusicSongsListAdapter.this.a(musicSong);
                    idy.b(AnalyticsValue.HEALTH_MUSIC_MOVE_SONG_TO_MENU_1090083.value(), MusicSongsListAdapter.this.f25030c);
                } else {
                    ArrayList<MusicSong> arrayList = new ArrayList<>(16);
                    arrayList.add(musicSong);
                    ((MusicMainActivity) MusicSongsListAdapter.this.f25028a).d(true, arrayList, MusicSongsListAdapter.this.g.size());
                    idy.b(AnalyticsValue.HEALTH_MUSIC_CREATE_NEW_SONG_MENU_1090082.value(), MusicSongsListAdapter.this.f25030c);
                }
            }
        });
        viewInflate.findViewById(R.id.del_song_from_menu_rl).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.views.music.MusicSongsListAdapter.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (musicMainActivity.e() != 2) {
                    MusicSongsListAdapter.this.e();
                    return;
                }
                qop qopVar2 = qopVar;
                if (qopVar2 != null) {
                    qopVar2.e();
                }
                MusicSongsListAdapter.this.b(musicSong);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Context context = this.f25028a;
        qpx.e(context, context.getResources().getString(R.string.IDS_hw_health_music_check_bluetooth_connection));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final MusicSong musicSong) {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.f25028a);
        if (this.g.size() <= 0) {
            builder.a(this.f25028a.getResources().getString(R.string.IDS_hw_health_music_no_menu_delete_tip));
        } else {
            builder.a(this.f25028a.getResources().getString(R.string.IDS_hw_health_music_delete_tip));
        }
        builder.a(this.f25028a.getResources().getString(R.string.IDS_hw_health_music_no_menu_delete_tip));
        builder.c(R.string.IDS_contact_confirm_ios_btn, new View.OnClickListener() { // from class: com.huawei.ui.device.views.music.MusicSongsListAdapter.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MusicSongsListAdapter.this.f25028a instanceof MusicMainActivity) {
                    int iE = ((MusicMainActivity) MusicSongsListAdapter.this.f25028a).e();
                    LogUtil.a("MusicMainActivity_MusicSongsListAdapter", "deleteMusicTip confirm deviceConnectState : ", Integer.valueOf(iE));
                    if (iE == 2) {
                        MusicSongsListAdapter.this.c(musicSong);
                        idy.b(AnalyticsValue.HEALTH_MUSIC_DELETE_SONG_1090084.value(), MusicSongsListAdapter.this.f25030c);
                        return;
                    } else {
                        MusicSongsListAdapter.this.e();
                        return;
                    }
                }
                LogUtil.a("MusicMainActivity_MusicSongsListAdapter", "deleteMusicTip confirm : mContext is not MusicMainActivity");
            }
        }).a(R.string.IDS_hw_common_ui_dialog_cancel, new View.OnClickListener() { // from class: com.huawei.ui.device.views.music.MusicSongsListAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("MusicMainActivity_MusicSongsListAdapter", "cancel!");
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        if (noTitleCustomAlertDialogC.isShowing()) {
            return;
        }
        noTitleCustomAlertDialogC.show();
    }

    private void e(RecyclerView recyclerView, View view, final MusicSong musicSong) {
        MenuListAdapter menuListAdapter = new MenuListAdapter(this.f25028a, this.g);
        recyclerView.setAdapter(menuListAdapter);
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.f25028a);
        builder.c(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.device.views.music.MusicSongsListAdapter.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
            }
        });
        builder.b(view, 0, 0);
        builder.b(false);
        final CustomViewDialog customViewDialogD = builder.d();
        if (customViewDialogD != null) {
            customViewDialogD.setCancelable(false);
            customViewDialogD.show();
        }
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.create_new_menu);
        if ((this.f25028a instanceof MusicMainActivity) && this.g.size() >= ((MusicMainActivity) this.f25028a).d()) {
            healthTextView.setVisibility(8);
        }
        healthTextView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.views.music.MusicSongsListAdapter.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                customViewDialogD.dismiss();
                ArrayList<MusicSong> arrayList = new ArrayList<>(16);
                arrayList.add(musicSong);
                ((MusicMainActivity) MusicSongsListAdapter.this.f25028a).d(true, arrayList, MusicSongsListAdapter.this.g.size());
            }
        });
        menuListAdapter.e(new AnonymousClass9(menuListAdapter, musicSong, customViewDialogD));
    }

    /* JADX INFO: renamed from: com.huawei.ui.device.views.music.MusicSongsListAdapter$9, reason: invalid class name */
    public class AnonymousClass9 implements MenuListAdapter.OnItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MenuListAdapter f25044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CustomViewDialog f25045b;
        final /* synthetic */ MusicSong d;

        AnonymousClass9(MenuListAdapter menuListAdapter, MusicSong musicSong, CustomViewDialog customViewDialog) {
            this.f25044a = menuListAdapter;
            this.d = musicSong;
            this.f25045b = customViewDialog;
        }

        @Override // com.huawei.ui.device.views.music.MenuListAdapter.OnItemClickListener
        public void onItemClick(View view, int i) {
            LogUtil.a("MusicMainActivity_MusicSongsListAdapter", "onItemClick enter time:", Long.valueOf(System.currentTimeMillis()));
            MusicSongsListAdapter.this.d(this.f25044a, this.d, i);
            final CustomViewDialog customViewDialog = this.f25045b;
            view.postDelayed(new Runnable() { // from class: rgb
                @Override // java.lang.Runnable
                public final void run() {
                    MusicSongsListAdapter.AnonymousClass9.b(customViewDialog);
                }
            }, 300L);
        }

        public static /* synthetic */ void b(CustomViewDialog customViewDialog) {
            if (customViewDialog != null) {
                customViewDialog.dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MusicSong musicSong) {
        View viewInflate = this.d.inflate(R.layout.dialog_add_to_menu, (ViewGroup) null);
        HealthRecycleView healthRecycleView = (HealthRecycleView) viewInflate.findViewById(R.id.menu_list);
        healthRecycleView.setLayoutManager(new LinearLayoutManager(this.f25028a));
        healthRecycleView.setNestedScrollingEnabled(false);
        healthRecycleView.b(false);
        healthRecycleView.e(false);
        healthRecycleView.setIsScroll(false);
        e(healthRecycleView, viewInflate, musicSong);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(MenuListAdapter menuListAdapter, final MusicSong musicSong, int i) {
        menuListAdapter.a(i);
        int size = menuListAdapter.d().size();
        if (i < 0 || i >= size) {
            LogUtil.a("MusicMainActivity_MusicSongsListAdapter", "menuItemClick failed, position is outof index");
            return;
        }
        final MusicMenu musicMenu = menuListAdapter.d().get(i);
        if (musicMenu.getMusicSongsList().contains(musicSong)) {
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        try {
            arrayList.add(Integer.valueOf(musicSong.getSongIndex()));
            OperationStruct operationStruct = new OperationStruct();
            operationStruct.setOperationType(3);
            operationStruct.setFolderIndex(Integer.parseInt(musicMenu.getMenuIndex()));
            operationStruct.setMusicIndexs(arrayList);
            lzl.a(this.f25028a).c(operationStruct, new IBaseResponseCallback() { // from class: com.huawei.ui.device.views.music.MusicSongsListAdapter.7
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    LogUtil.a("MusicMainActivity_MusicSongsListAdapter", "receive rsp time:", Long.valueOf(System.currentTimeMillis()));
                    if (i2 == 100000) {
                        musicMenu.getMusicSongsList().add(musicSong);
                        MusicMenu musicMenu2 = musicMenu;
                        musicMenu2.setMenuMusicCount(musicMenu2.getMenuMusicCount() + 1);
                        Message messageObtainMessage = MusicSongsListAdapter.this.f25029b.obtainMessage();
                        messageObtainMessage.what = 1001;
                        MusicSongsListAdapter.this.f25029b.sendMessage(messageObtainMessage);
                        return;
                    }
                    LogUtil.a("MusicMainActivity_MusicSongsListAdapter", "add music in folder failed,", " errCode:", Integer.valueOf(i2));
                }
            });
        } catch (NumberFormatException e) {
            LogUtil.a("MusicMainActivity_MusicSongsListAdapter", "get mCurrentMenu's index is null,exception:", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final MusicSong musicSong) {
        LogUtil.a("MusicMainActivity_MusicSongsListAdapter", "deleteSongFromMenuByUser enter");
        if (musicSong == null) {
            LogUtil.a("MusicMainActivity_MusicSongsListAdapter", "deleteSongFromMenuByUser failed, song is null!");
            return;
        }
        if (TextUtils.isEmpty(musicSong.getFileName())) {
            LogUtil.a("MusicMainActivity_MusicSongsListAdapter", "deleteSongFromMenuByUser failed, fileName is empty!");
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        try {
            arrayList.add(Integer.valueOf(musicSong.getSongIndex()));
            OperationStruct operationStruct = new OperationStruct();
            operationStruct.setOperationType(4);
            operationStruct.setFolderIndex(0);
            operationStruct.setMusicIndexs(arrayList);
            lzl.a(this.f25028a).c(operationStruct, new IBaseResponseCallback() { // from class: com.huawei.ui.device.views.music.MusicSongsListAdapter.10
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("MusicMainActivity_MusicSongsListAdapter", "reveice deleteSongFromMenuByUser rsp");
                    if (i == 100000) {
                        for (MusicMenu musicMenu : MusicSongsListAdapter.this.g) {
                            if (musicMenu.getMusicSongsList().contains(musicSong)) {
                                musicMenu.getMusicSongsList().remove(musicSong);
                                musicMenu.setMenuMusicCount(musicMenu.getMenuMusicCount() - 1);
                            }
                        }
                        Message messageObtainMessage = MusicSongsListAdapter.this.f25029b.obtainMessage();
                        messageObtainMessage.obj = musicSong;
                        messageObtainMessage.what = 1000;
                        MusicSongsListAdapter.this.f25029b.sendMessage(messageObtainMessage);
                        LogUtil.a("MusicMainActivity_MusicSongsListAdapter", "delete music in folder succeed!");
                        return;
                    }
                    LogUtil.a("MusicMainActivity_MusicSongsListAdapter", "delete music in folder failed, errCode:", Integer.valueOf(i));
                }
            });
        } catch (NumberFormatException e) {
            LogUtil.a("MusicMainActivity_MusicSongsListAdapter", "delete music in folder failed, exception:", e);
        }
    }
}
