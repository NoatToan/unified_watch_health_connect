package androidx.fragment.app;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class n0 extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f7307a = new Handler();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f7308b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f7309c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ListAdapter f7310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ListView f7311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f7312f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f7313g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f7314h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7315i;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ListView listView = n0.this.f7311e;
            listView.focusableViewAvailable(listView);
        }
    }

    public class b implements AdapterView.OnItemClickListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view2, int i14, long j8) {
            n0.this.v6((ListView) adapterView, view2, i14);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context contextRequireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(contextRequireContext);
        LinearLayout linearLayout = new LinearLayout(contextRequireContext);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(contextRequireContext, null, R.attr.progressBarStyleLarge), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(contextRequireContext);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(contextRequireContext);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(contextRequireContext);
        listView.setId(R.id.list);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f7307a.removeCallbacks(this.f7308b);
        this.f7311e = null;
        this.f7315i = false;
        this.f7314h = null;
        this.f7313g = null;
        this.f7312f = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view2, Bundle bundle) {
        super.onViewCreated(view2, bundle);
        u6();
    }

    public final void u6() {
        if (this.f7311e != null) {
            return;
        }
        View view2 = getView();
        if (view2 == null) {
            vb.h.z("Content view not yet created");
            return;
        }
        if (view2 instanceof ListView) {
            this.f7311e = (ListView) view2;
        } else {
            TextView textView = (TextView) view2.findViewById(16711681);
            if (textView == null) {
                this.f7312f = view2.findViewById(R.id.empty);
            } else {
                textView.setVisibility(8);
            }
            this.f7313g = view2.findViewById(16711682);
            this.f7314h = view2.findViewById(16711683);
            View viewFindViewById = view2.findViewById(R.id.list);
            if (!(viewFindViewById instanceof ListView)) {
                if (viewFindViewById == null) {
                    kg.f.n("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    return;
                } else {
                    kg.f.n("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                    return;
                }
            }
            ListView listView = (ListView) viewFindViewById;
            this.f7311e = listView;
            View view3 = this.f7312f;
            if (view3 != null) {
                listView.setEmptyView(view3);
            }
        }
        this.f7315i = true;
        this.f7311e.setOnItemClickListener(this.f7309c);
        ListAdapter listAdapter = this.f7310d;
        if (listAdapter != null) {
            this.f7310d = null;
            w6(listAdapter);
        } else if (this.f7313g != null) {
            y6(false, false);
        }
        this.f7307a.post(this.f7308b);
    }

    public void v6(ListView listView, View view2, int i14) {
    }

    public final void w6(ListAdapter listAdapter) {
        boolean z14 = this.f7310d != null;
        this.f7310d = listAdapter;
        ListView listView = this.f7311e;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (this.f7315i || z14) {
                return;
            }
            y6(true, requireView().getWindowToken() != null);
        }
    }

    public final void y6(boolean z14, boolean z15) {
        u6();
        View view2 = this.f7313g;
        if (view2 == null) {
            vb.h.z("Can't be used with a custom content view");
            return;
        }
        if (this.f7315i == z14) {
            return;
        }
        this.f7315i = z14;
        if (z14) {
            if (z15) {
                view2.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
                this.f7314h.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in));
            } else {
                view2.clearAnimation();
                this.f7314h.clearAnimation();
            }
            this.f7313g.setVisibility(8);
            this.f7314h.setVisibility(0);
            return;
        }
        if (z15) {
            view2.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in));
            this.f7314h.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
        } else {
            view2.clearAnimation();
            this.f7314h.clearAnimation();
        }
        this.f7313g.setVisibility(0);
        this.f7314h.setVisibility(8);
    }
}
