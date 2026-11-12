package com.xiaomi.hm.health.bodyfat.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.databases.model.UserInfos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class WeightUserQuickPicker extends FrameLayout {
    private static final int r = 3;
    private boolean a;
    private RecyclerView b;
    private e c;
    private LinearLayoutManager d;
    private int e;
    private int f;
    private int g;
    private int h;
    private OnUserItemClickListener i;
    private int j;
    private int k;
    private float l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;

    public interface OnUserItemClickListener {
        void onClick(@Nullable View view, UserInfos userInfos, int i);
    }

    public static class UserViewHolder extends RecyclerView.ViewHolder {
        public ImageView a;
        public ImageView b;

        public UserViewHolder(View view) {
            super(view);
            this.a = (ImageView) view.findViewById(R.id.user_avatar);
            this.b = (ImageView) view.findViewById(R.id.user_filter);
        }
    }

    public class a extends RecyclerView.ItemDecoration {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            rect.left = WeightUserQuickPicker.this.f;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = WeightUserQuickPicker.this.f;
        }
    }

    public class b extends RecyclerView.OnScrollListener {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                if (WeightUserQuickPicker.this.a) {
                    WeightUserQuickPicker.this.w();
                } else {
                    WeightUserQuickPicker.this.a = true;
                }
            }
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ int a;

        public c(int i) {
            this.a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            int iFindFirstVisibleItemPosition = WeightUserQuickPicker.this.d.findFirstVisibleItemPosition();
            if (iFindFirstVisibleItemPosition == -1) {
                return;
            }
            int left = (WeightUserQuickPicker.this.d.findViewByPosition(iFindFirstVisibleItemPosition).getLeft() - WeightUserQuickPicker.this.e) % WeightUserQuickPicker.this.h;
            int i = ((iFindFirstVisibleItemPosition + 3) - WeightUserQuickPicker.this.k) * WeightUserQuickPicker.this.h;
            int iV = WeightUserQuickPicker.this.v(this.a) - (1 == WeightUserQuickPicker.this.getLayoutDirection() ? i + (left - WeightUserQuickPicker.this.f) : i - (left - WeightUserQuickPicker.this.f));
            if (iV == 0) {
                return;
            }
            if (1 == WeightUserQuickPicker.this.getLayoutDirection()) {
                iV = -iV;
            }
            WeightUserQuickPicker.this.b.smoothScrollBy(iV, 0);
            WeightUserQuickPicker.this.a = false;
        }
    }

    public class d implements Runnable {
        public final /* synthetic */ long a;

        public d(long j) {
            this.a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            int selection = WeightUserQuickPicker.this.getSelection(this.a);
            if (selection != WeightUserQuickPicker.this.k) {
                WeightUserQuickPicker.this.k = selection;
                if (WeightUserQuickPicker.this.i == null) {
                    WeightUserQuickPicker.this.setSelection(selection);
                    return;
                }
                if (selection == WeightUserQuickPicker.this.c.a.size()) {
                    selection--;
                }
                WeightUserQuickPicker.this.i.onClick(null, (UserInfos) WeightUserQuickPicker.this.c.a.get(selection), selection);
            }
        }
    }

    public class e extends RecyclerView.Adapter<UserViewHolder> {
        private List<UserInfos> a;

        public e(List<UserInfos> list) {
            if (list == null) {
                this.a = new ArrayList();
            }
            this.a = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(UserInfos userInfos, int i, View view) {
            if (WeightUserQuickPicker.this.i != null) {
                WeightUserQuickPicker.this.i.onClick(view, userInfos, i);
            }
        }

        public List<UserInfos> c() {
            return this.a;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull UserViewHolder userViewHolder, final int i) {
            final UserInfos userInfos = this.a.get(i);
            if (i < 3 || i > this.a.size() - 3) {
                userViewHolder.itemView.setVisibility(4);
            } else if (i == this.a.size() - 3) {
                userViewHolder.itemView.setVisibility(0);
                userViewHolder.a.setImageResource(R.drawable.add_family_normal);
            } else {
                userViewHolder.itemView.setVisibility(0);
                BFCallback.getInstance().updateAvatarUI(userViewHolder.a, userInfos.getAvatarPath(), userInfos.getAvatarUrl(), userInfos.getName(), Float.valueOf(WeightUserQuickPicker.this.l), Integer.valueOf(WeightUserQuickPicker.this.m), Integer.valueOf(WeightUserQuickPicker.this.n), Integer.valueOf(WeightUserQuickPicker.this.o), Integer.valueOf(WeightUserQuickPicker.this.p), Integer.valueOf(WeightUserQuickPicker.this.q));
            }
            if (WeightUserQuickPicker.this.j == i || i == this.a.size() - 1) {
                userViewHolder.b.setVisibility(4);
            } else {
                userViewHolder.b.setVisibility(0);
            }
            userViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.bodyfat.view.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.d(userInfos, i, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public UserViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return new UserViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_family_item, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }
    }

    public WeightUserQuickPicker(Context context) {
        this(context, null, 0);
    }

    private void u(int i) {
        this.j = i;
        this.c.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int v(int i) {
        u(i);
        int i2 = (i - this.k) * this.h;
        this.k = i;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        List<UserInfos> listC;
        e eVar = this.c;
        if (eVar == null || this.i == null || (listC = eVar.c()) == null || listC.isEmpty()) {
            return;
        }
        int iFindFirstVisibleItemPosition = this.d.findFirstVisibleItemPosition();
        View viewFindViewByPosition = this.d.findViewByPosition(iFindFirstVisibleItemPosition);
        if (viewFindViewByPosition == null || viewFindViewByPosition.getRight() <= this.g / 2) {
            int i = iFindFirstVisibleItemPosition + 3 + 1;
            this.i.onClick(null, listC.get(i), i);
        } else {
            int i2 = iFindFirstVisibleItemPosition + 3;
            this.i.onClick(null, listC.get(i2), i2);
        }
        if (viewFindViewByPosition == null || viewFindViewByPosition.getLeft() != this.e + this.f) {
            return;
        }
        this.a = true;
    }

    public void bindUsers(List<UserInfos> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        e eVar = new e(list);
        this.c = eVar;
        eVar.setHasStableIds(true);
        this.b.setAdapter(this.c);
    }

    public int getSelection(long j) {
        UserInfos userInfos;
        if (this.c == null) {
            bindUsers(UserInfoManager.getManager().getAllInfos());
        }
        Iterator it2 = this.c.a.iterator();
        int i = 0;
        while (it2.hasNext() && ((userInfos = (UserInfos) it2.next()) == null || Long.parseLong(userInfos.getUserId()) != j)) {
            i++;
        }
        return i;
    }

    public void setOnUserItemClickListener(OnUserItemClickListener onUserItemClickListener) {
        this.i = onUserItemClickListener;
    }

    public void setSelection(int i) {
        post(new c(i));
    }

    public void setSelectionUser(long j) {
        post(new d(j));
    }

    public WeightUserQuickPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WeightUserQuickPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = true;
        this.k = 3;
        FrameLayout.inflate(context, R.layout.view_weight_user_picker, this);
        this.l = context.getResources().getDimensionPixelSize(R.dimen.avatar_border_width);
        this.m = ContextCompat.getColor(context, R.color.avatar_border_color);
        this.n = ContextCompat.getColor(context, R.color.avatar_nick_name_bg_color);
        this.o = ContextCompat.getColor(context, R.color.avatar_text_color);
        Resources resources = context.getResources();
        int i2 = R.dimen.weight_user_picker_item_width;
        this.p = resources.getDimensionPixelSize(i2);
        this.q = context.getResources().getDimensionPixelSize(R.dimen.avatar_text_size);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.user_list);
        this.b = recyclerView;
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        this.d = linearLayoutManager;
        this.b.setLayoutManager(linearLayoutManager);
        this.e = getResources().getDimensionPixelSize(R.dimen.weight_user_picker_header_footer);
        this.g = getResources().getDimensionPixelSize(i2);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.weight_user_picker_item_padding);
        this.f = dimensionPixelSize;
        this.h = this.g + (dimensionPixelSize * 2);
        this.b.addItemDecoration(new a());
        this.b.setHorizontalFadingEdgeEnabled(true);
        this.b.setFadingEdgeLength(this.f * 2);
        this.b.addOnScrollListener(new b());
    }
}
