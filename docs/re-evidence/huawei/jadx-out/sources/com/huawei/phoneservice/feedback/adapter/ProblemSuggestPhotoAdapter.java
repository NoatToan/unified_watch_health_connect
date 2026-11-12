package com.huawei.phoneservice.feedback.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.huawei.phoneservice.faq.base.util.q;
import com.huawei.phoneservice.feedback.R;
import com.huawei.phoneservice.feedbackcommon.photolibrary.internal.entity.MediaItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class ProblemSuggestPhotoAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f21616c;
    private Context d;
    private List<MediaItem> e = new ArrayList();

    public interface b {
        void a(int i);

        void b(int i);

        void f();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewInflate;
        a aVar;
        if (view == null) {
            aVar = new a();
            viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.feedback_sdk_problem_item_image, viewGroup, false);
            aVar.f21617b = (ImageView) viewInflate.findViewById(R.id.feedback_sdk_iv_pic);
            aVar.e = (ImageView) viewInflate.findViewById(R.id.feedback_sdk_iv_del);
            aVar.f21618c = (ImageView) viewInflate.findViewById(R.id.feedback_sdk_iv_add);
            viewInflate.setTag(aVar);
        } else {
            viewInflate = view;
            aVar = (a) view.getTag();
        }
        if (i == getCount() - 1 && this.e.size() < com.huawei.phoneservice.feedbackcommon.utils.e.e()) {
            aVar.f21617b.setVisibility(8);
            aVar.f21618c.setVisibility(0);
            aVar.e.setVisibility(8);
            aVar.f21618c.setOnClickListener(new e(i));
            return viewInflate;
        }
        aVar.f21617b.setVisibility(0);
        aVar.f21618c.setVisibility(8);
        aVar.e.setVisibility(0);
        e eVar = new e(i);
        aVar.e.setOnClickListener(eVar);
        aVar.f21617b.setOnClickListener(eVar);
        MediaItem item = getItem(i);
        if (this.d != null && item != null && item.getFilePath() != null && aVar.f21617b != null) {
            Glide.with(this.d.getApplicationContext()).load(item.getFilePath()).into(aVar.f21617b);
        }
        return viewInflate;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.e.size() >= com.huawei.phoneservice.feedbackcommon.utils.e.e() ? com.huawei.phoneservice.feedbackcommon.utils.e.e() : this.e.size() + 1;
    }

    public void d(List<MediaItem> list) {
        this.e = list;
        if (list == null) {
            this.e = new ArrayList();
        }
        notifyDataSetChanged();
    }

    public void b(b bVar) {
        this.f21616c = bVar;
    }

    class e implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f21619a;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (q.b(view) || ProblemSuggestPhotoAdapter.this.f21616c == null) {
                return;
            }
            int id = view.getId();
            if (id == R.id.feedback_sdk_iv_pic) {
                ProblemSuggestPhotoAdapter.this.f21616c.a(this.f21619a);
            } else if (id == R.id.feedback_sdk_iv_add) {
                ProblemSuggestPhotoAdapter.this.f21616c.f();
            } else if (id == R.id.feedback_sdk_iv_del) {
                ProblemSuggestPhotoAdapter.this.f21616c.b(this.f21619a);
            }
        }

        e(int i) {
            this.f21619a = i;
        }
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public MediaItem getItem(int i) {
        List<MediaItem> list = this.e;
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        return this.e.get(i);
    }

    static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ImageView f21617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ImageView f21618c;
        ImageView e;

        a() {
        }
    }

    public ProblemSuggestPhotoAdapter(Context context) {
        this.d = context;
    }
}
