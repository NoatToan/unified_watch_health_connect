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
public class ListFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f2375a = new Handler();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f2376b = new a();
    public final AdapterView.OnItemClickListener c = new b();
    public ListAdapter d;
    public ListView e;
    public View f;
    public TextView g;
    public View h;
    public View i;
    public CharSequence j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2377k;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListView listView = ListFragment.this.e;
            listView.focusableViewAvailable(listView);
        }
    }

    public class b implements AdapterView.OnItemClickListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ListFragment.this.t((ListView) adapterView, view, i, j);
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
    public void onDestroyView() {
        this.f2375a.removeCallbacks(this.f2376b);
        this.e = null;
        this.f2377k = false;
        this.i = null;
        this.h = null;
        this.f = null;
        this.g = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        s();
    }

    public final void s() {
        if (this.e != null) {
            return;
        }
        View view = getView();
        if (view == null) {
            throw new IllegalStateException("Content view not yet created");
        }
        if (view instanceof ListView) {
            this.e = (ListView) view;
        } else {
            TextView textView = (TextView) view.findViewById(16711681);
            this.g = textView;
            if (textView == null) {
                this.f = view.findViewById(R.id.empty);
            } else {
                textView.setVisibility(8);
            }
            this.h = view.findViewById(16711682);
            this.i = view.findViewById(16711683);
            View viewFindViewById = view.findViewById(R.id.list);
            if (!(viewFindViewById instanceof ListView)) {
                if (viewFindViewById != null) {
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
            }
            ListView listView = (ListView) viewFindViewById;
            this.e = listView;
            View view2 = this.f;
            if (view2 != null) {
                listView.setEmptyView(view2);
            } else {
                CharSequence charSequence = this.j;
                if (charSequence != null) {
                    this.g.setText(charSequence);
                    this.e.setEmptyView(this.g);
                }
            }
        }
        this.f2377k = true;
        this.e.setOnItemClickListener(this.c);
        ListAdapter listAdapter = this.d;
        if (listAdapter != null) {
            this.d = null;
            u(listAdapter);
        } else if (this.h != null) {
            v(false, false);
        }
        this.f2375a.post(this.f2376b);
    }

    public void t(ListView listView, View view, int i, long j) {
    }

    public void u(ListAdapter listAdapter) {
        boolean z = this.d != null;
        this.d = listAdapter;
        ListView listView = this.e;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (this.f2377k || z) {
                return;
            }
            v(true, requireView().getWindowToken() != null);
        }
    }

    public final void v(boolean z, boolean z2) {
        s();
        View view = this.h;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        if (this.f2377k == z) {
            return;
        }
        this.f2377k = z;
        if (z) {
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
                this.i.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in));
            } else {
                view.clearAnimation();
                this.i.clearAnimation();
            }
            this.h.setVisibility(8);
            this.i.setVisibility(0);
            return;
        }
        if (z2) {
            view.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in));
            this.i.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
        } else {
            view.clearAnimation();
            this.i.clearAnimation();
        }
        this.h.setVisibility(0);
        this.i.setVisibility(8);
    }
}
