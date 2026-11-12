package com.huawei.healthcloud.plugintrack.ui.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.google.gson.annotations.SerializedName;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.activity.interactor.MapInteractor;
import com.huawei.healthcloud.plugintrack.ui.map.mapdescription.MapTypeDescription;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.jeq;
import defpackage.jes;
import defpackage.jew;
import defpackage.lls;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qqr;
import health.compact.a.CommonUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class CustomMapStyleAdapter extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f10945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f10946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f10947c;
    private String d = null;
    private a e;
    private boolean f;
    private MapInteractor.MapItemClickListener g;
    private List<jes> h;
    private int i;
    private LayoutInflater j;
    private List<jeq> l;
    private int m;
    private MapInteractor.MapItemClickListener n;
    private View o;

    public CustomMapStyleAdapter(Context context, List<jes> list, int i, MapTypeDescription.MapType mapType, int i2, MapInteractor.MapItemClickListener mapItemClickListener) {
        this.i = 0;
        this.f10945a = context;
        this.h = list;
        this.g = mapItemClickListener;
        if (list != null) {
            this.i = list.size();
            Iterator<jes> it = this.h.iterator();
            while (it.hasNext()) {
                if (TextUtils.isEmpty(it.next().a())) {
                    this.f10946b = true;
                    break;
                }
            }
        }
        this.j = LayoutInflater.from(this.f10945a);
        this.f = true;
        this.m = i2;
        e(mapType, i, i2);
        LogUtil.a("Track_CustomMapStyleAdapter", "start mCheckBoxPosition = ", Integer.valueOf(this.f10947c));
    }

    public void c(List<jeq> list) {
        this.l = list;
        this.i = list == null ? 0 : list.size();
        c(this.f10947c);
        notifyDataSetChanged();
    }

    public CustomMapStyleAdapter(Context context, List<jeq> list, int i, MapInteractor.MapItemClickListener mapItemClickListener) {
        this.i = 0;
        this.f10945a = context;
        this.l = list;
        this.n = mapItemClickListener;
        this.i = list == null ? 0 : list.size();
        this.j = LayoutInflater.from(this.f10945a);
        this.f = false;
        c(i);
    }

    private void e(MapTypeDescription.MapType mapType, int i, int i2) {
        if (!this.f10946b) {
            if (i2 == 2) {
                d(mapType, i);
                return;
            } else if (i2 == 3) {
                e(mapType, i);
                return;
            } else {
                a(mapType, i);
                return;
            }
        }
        if (mapType == MapTypeDescription.MapType.MAP_TYPE_CUSTOM || mapType == MapTypeDescription.MapType.DEFAULT_MAP_THREE_D) {
            c(i);
            return;
        }
        int iB = b(mapType);
        for (int i3 = 0; i3 < this.i; i3++) {
            if (!TextUtils.isEmpty(this.h.get(i3).a()) && iB == this.h.get(i3).b()) {
                this.f10947c = i3;
            }
        }
    }

    public int c() {
        return this.f10947c;
    }

    private void d(MapTypeDescription.MapType mapType, int i) {
        if (mapType == MapTypeDescription.MapType.MAP_TYPE_NORMAL) {
            this.f10947c = 0;
            return;
        }
        if (mapType == MapTypeDescription.MapType.MAP_TYPE_NIGHT) {
            this.f10947c = 1;
        } else if (mapType == MapTypeDescription.MapType.MAP_TYPE_CUSTOM) {
            c(i);
        } else {
            LogUtil.a("Track_CustomMapStyleAdapter", "checkPositionForGoogle other type");
        }
    }

    private void e(MapTypeDescription.MapType mapType, int i) {
        if (mapType == MapTypeDescription.MapType.MAP_TYPE_NORMAL) {
            this.f10947c = 0;
            return;
        }
        if (mapType == MapTypeDescription.MapType.MAP_TYPE_NIGHT) {
            this.f10947c = 1;
        } else if (mapType == MapTypeDescription.MapType.MAP_TYPE_CUSTOM || mapType == MapTypeDescription.MapType.DEFAULT_MAP_THREE_D) {
            c(i);
        } else {
            LogUtil.a("Track_CustomMapStyleAdapter", "checkPositionForHuawei other type");
        }
    }

    private void a(MapTypeDescription.MapType mapType, int i) {
        if (mapType == MapTypeDescription.MapType.MAP_TYPE_NORMAL) {
            this.f10947c = 0;
            return;
        }
        if (mapType == MapTypeDescription.MapType.MAP_TYPE_SATELLITE) {
            this.f10947c = 1;
            return;
        }
        if (mapType == MapTypeDescription.MapType.MAP_TYPE_NIGHT) {
            this.f10947c = 2;
        } else if (mapType == MapTypeDescription.MapType.MAP_TYPE_NAVI) {
            this.f10947c = 3;
        } else {
            c(i);
        }
    }

    private int b(MapTypeDescription.MapType mapType) {
        if (mapType == MapTypeDescription.MapType.MAP_TYPE_NORMAL) {
            return 1;
        }
        if (mapType == MapTypeDescription.MapType.MAP_TYPE_SATELLITE) {
            return 2;
        }
        if (mapType == MapTypeDescription.MapType.MAP_TYPE_NIGHT) {
            return 3;
        }
        if (mapType == MapTypeDescription.MapType.MAP_TYPE_NAVI) {
            return 4;
        }
        LogUtil.j("Track_CustomMapStyleAdapter", "currentType error");
        return 2;
    }

    private void c(int i) {
        if (i > this.i || i < 0) {
            this.f10947c = 0;
        } else {
            this.f10947c = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, ImageView imageView) {
        if (str != null) {
            qqf.a(this.f10945a, imageView);
            qqf.c(new File(str), new RequestOptions().diskCacheStrategy(DiskCacheStrategy.ALL).transform(new qqr(this.f10945a.getApplicationContext(), (int) this.f10945a.getResources().getDimension(R.dimen.emui_corner_radius_clicked))), imageView);
            return;
        }
        LogUtil.j("Track_CustomMapStyleAdapter", "path = null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:41:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v6, types: [T] */
    public <T> T e(String str, Class<T> cls) throws Throwable {
        FileInputStream fileInputStream;
        ?? r1;
        FileInputStream fileInputStream2 = (T) null;
        if (str == null) {
            return null;
        }
        String strC = CommonUtil.c(b(str));
        if (strC == null) {
            LogUtil.e("Track_CustomMapStyleAdapter", "languagePath is null");
            return null;
        }
        File file = new File(strC);
        if (file.exists()) {
            try {
                r1 = fileInputStream2;
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        boolean z = (T) lls.a(fileInputStream, cls);
                        try {
                            fileInputStream.close();
                            r1 = z;
                        } catch (IOException unused) {
                            LogUtil.j("Track_CustomMapStyleAdapter", "IOException");
                            r1 = z;
                        }
                    } catch (FileNotFoundException unused2) {
                        LogUtil.j("Track_CustomMapStyleAdapter", "FileNotFoundException");
                        r1 = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                                r1 = fileInputStream2;
                            } catch (IOException unused3) {
                                LogUtil.j("Track_CustomMapStyleAdapter", "IOException");
                                r1 = fileInputStream2;
                            }
                        }
                    }
                } catch (Throwable th) {
                    fileInputStream2 = (T) fileInputStream;
                    th = th;
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused4) {
                            LogUtil.j("Track_CustomMapStyleAdapter", "IOException");
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused5) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                throw th;
            }
        }
        r1 = fileInputStream2;
        return (T) r1;
    }

    private String b(String str) {
        if (TextUtils.isEmpty(this.d)) {
            this.d = jew.d().a(str);
        }
        return jew.d().a(str, this.d);
    }

    public class c {

        @SerializedName("customStyleName")
        private String d;

        public String a() {
            return this.d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        LogUtil.a("Track_CustomMapStyleAdapter", "mItemCount = ", Integer.valueOf(this.i));
        return this.i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i) {
        this.o = this.j.inflate(R.layout.track_map_style_select_recycleview_layout, viewGroup, false);
        a aVar = new a(this.o);
        this.e = aVar;
        return aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, int i) {
        if (this.f) {
            if (njy.c(this.h, i)) {
                aVar.c(this.h.get(i), i, aVar);
                return;
            } else {
                LogUtil.j("Track_CustomMapStyleAdapter", "mMapDataList is null");
                return;
            }
        }
        if (njy.c(this.l, i)) {
            aVar.e(this.l.get(i), i, aVar);
        } else {
            LogUtil.j("Track_CustomMapStyleAdapter", "mMarkDataList is null");
        }
    }

    class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f10949b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ImageView f10950c;
        private HealthCheckBox d;
        private ImageView e;

        a(View view) {
            super(view);
            this.f10950c = (ImageView) view.findViewById(R.id.map_style_thumbnail);
            this.d = (HealthCheckBox) view.findViewById(R.id.retrack_select_satellate);
            this.f10949b = (HealthTextView) view.findViewById(R.id.map_style_description);
            this.e = (ImageView) view.findViewById(R.id.map_badge_icon);
        }

        public void e(final jeq jeqVar, final int i, final a aVar) {
            CustomMapStyleAdapter.this.b(jeqVar.a(), aVar.f10950c);
            d(aVar, i);
            aVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.adapter.CustomMapStyleAdapter.a.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (CustomMapStyleAdapter.this.n != null) {
                        CustomMapStyleAdapter.this.n.onClickListener(jeqVar, i);
                        aVar.d.setChecked(true);
                        CustomMapStyleAdapter.this.f10947c = i;
                        CustomMapStyleAdapter.this.notifyDataSetChanged();
                    }
                }
            });
        }

        public void c(final jes jesVar, final int i, final a aVar) {
            c(jesVar, aVar, i);
            d(aVar, i);
            aVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.adapter.CustomMapStyleAdapter.a.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (CustomMapStyleAdapter.this.g != null) {
                        CustomMapStyleAdapter.this.g.onClickListener(jesVar, i);
                        aVar.d.setChecked(true);
                        CustomMapStyleAdapter.this.f10947c = i;
                        CustomMapStyleAdapter.this.notifyDataSetChanged();
                    }
                }
            });
        }

        private void c(jes jesVar, a aVar, int i) {
            if (!TextUtils.isEmpty(jesVar.a())) {
                b(jesVar, aVar);
                return;
            }
            aVar.e.setVisibility(8);
            c cVar = (c) CustomMapStyleAdapter.this.e(jesVar.i(), c.class);
            CustomMapStyleAdapter.this.b(jesVar.d(), this.f10950c);
            if (cVar == null) {
                LogUtil.a("Track_CustomMapStyleAdapter", " customMapStyleLanguage == null   ", Integer.valueOf(i));
            } else {
                if (cVar.a() == null) {
                    LogUtil.j("Track_CustomMapStyleAdapter", " customMapStyleLanguage.getStyleName()  == null ");
                    return;
                }
                LogUtil.a("Track_CustomMapStyleAdapter", "Language customMapStyleLanguage.getStyleName() = ", cVar.a());
                this.f10949b.setText(cVar.a());
                this.f10949b.setVisibility(0);
            }
        }

        private void d(a aVar, int i) {
            if (i == CustomMapStyleAdapter.this.f10947c) {
                aVar.d.setChecked(true);
                aVar.d.setVisibility(0);
            } else {
                aVar.d.setChecked(false);
                aVar.d.setVisibility(4);
            }
        }

        private void b(jes jesVar, a aVar) {
            String string;
            int i;
            int iB = jesVar.b();
            qqf.a(CustomMapStyleAdapter.this.f10945a, aVar.f10950c);
            qqf.a(CustomMapStyleAdapter.this.f10945a, aVar.e);
            if (iB == 1) {
                string = CustomMapStyleAdapter.this.f10945a.getResources().getString(R.string.IDS_retrack_map_type_normal);
                i = R.drawable.retrack_ic_mapstyle_normal;
            } else if (iB == 2) {
                string = CustomMapStyleAdapter.this.f10945a.getResources().getString(R.string.IDS_retrack_map_type_satellite);
                i = R.drawable.retrack_ic_mapstyle_satellate;
            } else if (iB != 3) {
                if (iB == 4) {
                    string = CustomMapStyleAdapter.this.f10945a.getResources().getString(R.string.IDS_retrack_map_type_navi);
                    i = R.drawable.retrack_ic_mapstyle_navi;
                } else if (iB != 5) {
                    LogUtil.j("Track_CustomMapStyleAdapter", "default value is error");
                    i = -1;
                    string = "";
                } else {
                    string = CustomMapStyleAdapter.this.f10945a.getResources().getString(R.string.IDS_retrack_map_type_3d_map);
                    i = R.drawable.retrack_ic_mapstyle_satellate;
                }
            } else if (CustomMapStyleAdapter.this.m == 1) {
                string = CustomMapStyleAdapter.this.f10945a.getResources().getString(R.string.IDS_retrack_map_type_dark_blue);
                i = R.drawable.retrack_ic_mapstyle_dark_blue;
            } else {
                string = CustomMapStyleAdapter.this.f10945a.getResources().getString(R.string.IDS_retrack_map_type_night);
                i = R.drawable.retrack_ic_mapstyle_the_night;
            }
            e(jesVar, aVar, i);
            LogUtil.a("Track_CustomMapStyleAdapter", " defaultValue title =  ", string);
            this.f10949b.setText(string);
            this.f10949b.setVisibility(0);
        }

        private void e(jes jesVar, a aVar, int i) {
            if (i != -1) {
                qqf.a(CustomMapStyleAdapter.this.f10945a, aVar.f10950c);
                qqf.d(i, new RequestOptions().diskCacheStrategy(DiskCacheStrategy.ALL).transform(new qqr(CustomMapStyleAdapter.this.f10945a.getApplicationContext(), (int) CustomMapStyleAdapter.this.f10945a.getResources().getDimension(R.dimen.emui_corner_radius_clicked))), aVar.f10950c);
            }
            if (jesVar.l()) {
                aVar.e.setVisibility(0);
                qqf.b(jesVar.c(), aVar.e, 0.0f, qqf.d, 0.0f, 0.0f);
            } else {
                aVar.e.setVisibility(8);
            }
        }
    }
}
