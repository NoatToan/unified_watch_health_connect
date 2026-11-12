package com.huami.watch.companion.sport.ui.fragment;

import android.graphics.Point;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.watch.companion.R;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class MenuFragment extends DialogFragment {
    public static final int STYLE_SHOW_BOTTOM = 1;
    public static final int STYLE_WITHOUT_BOTTOM = 0;
    private static final String i = "style";
    private static final String j = "index";
    private static final String k = "align";
    private RecyclerView a;
    private b b;
    private List<MenuInfo> c;
    private MenuClickListener d;
    private TextView e;
    private int f = 0;
    private int g = -1;
    private boolean h = false;

    public interface MenuClickListener {
        void onClickMenu(int i);
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MenuFragment.this.dismissAllowingStateLoss();
        }
    }

    public class b extends RecyclerView.Adapter<C0657b> {

        public class a implements View.OnClickListener {
            public final /* synthetic */ MenuInfo a;

            public a(MenuInfo menuInfo) {
                this.a = menuInfo;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MenuFragment.this.d != null) {
                    MenuFragment.this.d.onClickMenu(this.a.c);
                }
            }
        }

        /* JADX INFO: renamed from: com.huami.watch.companion.sport.ui.fragment.MenuFragment$b$b, reason: collision with other inner class name */
        public class C0657b extends RecyclerView.ViewHolder {
            public ImageView a;
            public TextView b;
            public View c;

            public C0657b(View view) {
                super(view);
                this.c = view;
                this.a = (ImageView) view.findViewById(R.id.menu_icon);
                this.b = (TextView) view.findViewById(R.id.menu_title);
            }
        }

        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C0657b c0657b, int i) {
            MenuInfo menuInfo;
            if (MenuFragment.this.c == null || (menuInfo = (MenuInfo) MenuFragment.this.c.get(i)) == null) {
                return;
            }
            if (MenuFragment.this.g <= -1) {
                if (menuInfo.a != 0) {
                    c0657b.a.setVisibility(0);
                    c0657b.a.setImageResource(menuInfo.a);
                } else {
                    c0657b.a.setVisibility(4);
                }
            }
            if (MenuFragment.this.g == i) {
                c0657b.a.setImageResource(R.drawable.ic_current_menu_item);
                c0657b.a.setVisibility(0);
                c0657b.b.setSelected(true);
            } else {
                c0657b.b.setSelected(false);
                c0657b.a.setVisibility(4);
            }
            c0657b.b.setText(menuInfo.b);
            c0657b.c.setOnClickListener(new a(menuInfo));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0657b onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C0657b(LayoutInflater.from(MenuFragment.this.getContext()).inflate(MenuFragment.this.h ? R.layout.menu_item_align_left : R.layout.menu_item, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getPagerCount() {
            if (MenuFragment.this.c != null) {
                return MenuFragment.this.c.size();
            }
            return 0;
        }
    }

    private void initView(View view) {
        this.e = (TextView) view.findViewById(R.id.bottom);
        this.a = (RecyclerView) view.findViewById(R.id.recycler_view);
        if (this.f == 1) {
            this.e.setVisibility(0);
            this.e.setOnClickListener(new a());
        } else {
            this.e.setVisibility(8);
        }
        this.a.setLayoutManager(new LinearLayoutManager(getContext()));
        this.a.setHasFixedSize(true);
        b bVar = new b();
        this.b = bVar;
        this.a.setAdapter(bVar);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getContext(), 1);
        dividerItemDecoration.setDrawable(ContextCompat.getDrawable(getContext(), R.drawable.divider_line_item_without_padding));
        this.a.addItemDecoration(dividerItemDecoration);
    }

    public static MenuFragment newInstance(int i2) {
        MenuFragment menuFragment = new MenuFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("style", i2);
        menuFragment.setArguments(bundle);
        return menuFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        initView(getView());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f = arguments.getInt("style", 0);
            this.g = arguments.getInt("index", -1);
            this.h = arguments.getBoolean(k, false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getDialog().requestWindowFeature(1);
        return layoutInflater.inflate(R.layout.fragment_menu, viewGroup, false);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = getDialog().getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 81;
        if (this.f == 0) {
            WindowManager windowManager = getActivity().getWindowManager();
            Point point = new Point();
            windowManager.getDefaultDisplay().getSize(point);
            attributes.width = (int) (((double) point.x) * 0.5d);
        } else {
            window.setLayout(-1, attributes.height);
        }
        window.setAttributes(attributes);
    }

    public void setMenuClickListener(MenuClickListener menuClickListener) {
        this.d = menuClickListener;
    }

    public void setMenuInfoList(List<MenuInfo> list) {
        this.c = list;
    }

    public static class MenuInfo {
        public int a;
        public int b;
        public int c;

        public MenuInfo(int i, int i2, int i3) {
            this.c = i;
            this.a = i2;
            this.b = i3;
        }

        public int getIndex() {
            return this.c;
        }

        public MenuInfo(int i, int i2) {
            this.c = i;
            this.b = i2;
        }
    }

    public static MenuFragment newInstance(int i2, int i3, boolean z) {
        MenuFragment menuFragment = new MenuFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("style", i2);
        bundle.putInt("index", i3);
        bundle.putBoolean(k, z);
        menuFragment.setArguments(bundle);
        return menuFragment;
    }
}
