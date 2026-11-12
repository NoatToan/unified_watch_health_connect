package com.huami.watch.companion.ui.fragment;

import android.app.DialogFragment;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huami.watch.companion.R;
import com.huami.watch.util.Analytics;

/* JADX INFO: loaded from: classes16.dex */
public class SourceDuplicateFragment extends Fragment {
    private View a;
    private View b;
    private View c;
    private onItemClickLister d;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SourceDuplicateFragment.this.c();
            if (SourceDuplicateFragment.this.d != null) {
                SourceDuplicateFragment.this.d.cover();
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SourceDuplicateFragment.this.c();
            if (SourceDuplicateFragment.this.d != null) {
                SourceDuplicateFragment.this.d.asNew();
            }
        }
    }

    public interface onItemClickLister {
        void asNew();

        void cover();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null || !(parentFragment instanceof DialogFragment)) {
            return;
        }
        ((DialogFragment) parentFragment).dismiss();
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_source_duplicate, viewGroup, false);
        this.a = viewInflate;
        this.b = viewInflate.findViewById(R.id.watch_face_cover_bg);
        this.c = this.a.findViewById(R.id.watch_face_as_new_bg);
        this.b.setOnClickListener(new a());
        this.c.setOnClickListener(new b());
        return this.a;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        Analytics.endPage("SourceDuplicateFragment");
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        Analytics.startPage("SourceDuplicateFragment");
    }

    public void setOnItemClickLister(onItemClickLister onitemclicklister) {
        this.d = onitemclicklister;
    }
}
