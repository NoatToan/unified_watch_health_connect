package com.garmin.android.apps.connectmobile.connectiq;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class o extends RecyclerView.h<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f31925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<sd2.f> f31926b;

    public interface a {
    }

    public class b extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageView f31927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f31928b;

        public b(View view2) {
            super(view2);
            this.f31927a = (ImageView) view2.findViewById(R.id.connect_iq_row_device_image);
            this.f31928b = (TextView) view2.findViewById(R.id.connect_iq_row_device_name);
            view2.findViewById(R.id.connect_iq_device_row).setOnClickListener(new a32.b(this, 28));
        }
    }

    public o(List<sd2.f> list, a aVar) {
        this.f31926b = list;
        this.f31925a = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        List<sd2.f> list = this.f31926b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        b bVar = (b) f0Var;
        sd2.f fVar = this.f31926b.get(i14);
        bVar.f31928b.setText(TextUtils.isEmpty(fVar.getDisplayName()) ? fVar.getProductDisplayName() : fVar.getDisplayName());
        ImageView imageView = bVar.f31927a;
        imageView.getClass();
        zb0.t.c(imageView, fVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        return new b(androidx.room.a0.d(viewGroup, R.layout.connect_iq_device_row, viewGroup, false));
    }
}
