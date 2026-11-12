package com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.albumview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.request.RequestOptions;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.utils.PhotoModel;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.njy;
import defpackage.pao;
import defpackage.qqf;
import defpackage.qqr;
import defpackage.qrs;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class GridViewBaseAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LayoutInflater f10745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OnGridViewListener f10746b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<PhotoModel> f10747c;
    private Context e;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    public GridViewBaseAdapter(Context context, ArrayList<PhotoModel> arrayList) {
        this.e = context;
        this.f10747c = arrayList;
        this.f10745a = LayoutInflater.from(context);
    }

    public void a(OnGridViewListener onGridViewListener) {
        this.f10746b = onGridViewListener;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<PhotoModel> arrayList = this.f10747c;
        if (arrayList == null) {
            return 0;
        }
        if (arrayList.size() > 3) {
            return 3;
        }
        return this.f10747c.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (njy.e(this.f10747c, i)) {
            return null;
        }
        return this.f10747c.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(final int i, View view, ViewGroup viewGroup) {
        d dVar;
        if (i < 0) {
            return null;
        }
        if (view != null && (view.getTag() instanceof d)) {
            dVar = (d) view.getTag();
        } else {
            view = this.f10745a.inflate(R.layout.trackalbum_griditem_addphoto, viewGroup, false);
            dVar = new d(view);
            view.setTag(dVar);
        }
        PhotoModel photoModel = this.f10747c.get(i);
        if (photoModel == null) {
            if (qrs.x(this.e)) {
                dVar.f10749c.setImageDrawable(this.e.getResources().getDrawable(R.drawable.trackalbum_add_photo_night));
            } else {
                dVar.f10749c.setImageDrawable(this.e.getResources().getDrawable(R.drawable.trackalbum_add_photo));
            }
            if (i == 3) {
                dVar.f10749c.setVisibility(8);
                dVar.f10749c.setClickable(false);
            }
            dVar.e.setVisibility(8);
            return view;
        }
        RequestOptions requestOptionsOverride = new RequestOptions().dontAnimate().override(200, 200);
        Context context = this.e;
        qqf.e(photoModel.getPath(), requestOptionsOverride.transform(new CenterCrop(), new qqr(context, pao.e(context, 8.0f))), dVar.f10749c);
        dVar.e.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.albumview.GridViewBaseAdapter.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                GridViewBaseAdapter.this.f10747c.remove(i);
                GridViewBaseAdapter.this.f10746b.onPhotoOrVideoDelete(i);
                GridViewBaseAdapter.this.notifyDataSetChanged();
            }
        });
        return view;
    }

    public static class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ImageView f10749c;
        private final HealthTextView e;

        public d(View view) {
            this.f10749c = (ImageView) view.findViewById(R.id.photoView);
            this.e = (HealthTextView) view.findViewById(R.id.iv_del);
        }
    }
}
