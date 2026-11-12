package com.xiaomi.hm.health.relation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import com.xiaomi.hm.health.relation.R;
import com.xiaomi.hm.health.relation.copy.AvatarManager;

/* JADX INFO: loaded from: classes21.dex */
public class FriendView extends FrameLayout {
    private Context a;
    private View b;
    private AppCompatImageView c;
    private TextView d;
    private TextView e;
    private TextView f;

    public FriendView(@NonNull Context context) {
        this(context, null);
    }

    private void a() {
        this.b = View.inflate(this.a, R.layout.relatives_view_friend, this);
        this.c = (AppCompatImageView) findViewById(R.id.icon);
        this.d = (TextView) findViewById(R.id.username);
        this.e = (TextView) findViewById(R.id.uid);
        this.f = (TextView) findViewById(R.id.add_button);
        b(false);
    }

    private void b(boolean z) {
        if (z) {
            this.f.setTextColor(ContextCompat.getColor(getContext(), R.color.relatives_common_light_color));
            this.f.setText(R.string.relatives_title_add_friend);
            this.f.setEnabled(true);
        } else {
            this.f.setTextColor(ContextCompat.getColor(this.a, R.color.relatives_black40));
            this.f.setText(R.string.relatives_label_friend_added);
            this.f.setEnabled(false);
        }
    }

    public void setAddAction(View.OnClickListener onClickListener) {
        b(true);
        this.f.setOnClickListener(onClickListener);
    }

    public void setBackground(@ColorRes int i) {
        this.b.setBackgroundColor(ContextCompat.getColor(this.a, i));
    }

    public void setInfo(String str, String str2, String str3) {
        AvatarManager.updateAvatarUI(this.c, str, true, str2);
        this.d.setText(str2);
        this.e.setText(this.a.getString(R.string.relatives_label_uid, str3 + ""));
    }

    public FriendView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FriendView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = context;
        a();
    }
}
