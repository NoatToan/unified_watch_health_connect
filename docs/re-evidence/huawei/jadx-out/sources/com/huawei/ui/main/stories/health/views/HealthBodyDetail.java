package com.huawei.ui.main.stories.health.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;

/* JADX INFO: loaded from: classes19.dex */
public class HealthBodyDetail extends FrameLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[][][] f28182c = {new int[][]{new int[]{R.drawable.health_body_detail_head_fat_mass, R.drawable.health_body_detail_trunk_fat_mass, R.drawable.health_body_detail_left_hand_fat_mass, R.drawable.health_body_detail_right_hand_fat_mass, R.drawable.health_body_detail_left_leg_fat_mass, R.drawable.health_body_detail_right_leg_fat_mass}, new int[]{R.drawable.health_body_detail_head_fat_mass, R.drawable.health_body_detail_trunk_fat_mass_blue, R.drawable.health_body_detail_left_hand_fat_mass_blue, R.drawable.health_body_detail_right_hand_fat_mass_blue, R.drawable.health_body_detail_left_leg_fat_mass_blue, R.drawable.health_body_detail_right_leg_fat_mass_blue}, new int[]{R.drawable.health_body_detail_head_fat_mass, R.drawable.health_body_detail_trunk_fat_mass_green, R.drawable.health_body_detail_left_hand_fat_mass_green, R.drawable.health_body_detail_right_hand_fat_mass_green, R.drawable.health_body_detail_left_leg_fat_mass_green, R.drawable.health_body_detail_right_leg_fat_mass_green}, new int[]{R.drawable.health_body_detail_head_fat_mass, R.drawable.health_body_detail_trunk_fat_mass_orange, R.drawable.health_body_detail_left_hand_fat_mass_orange, R.drawable.health_body_detail_right_hand_fat_mass_orange, R.drawable.health_body_detail_left_leg_fat_mass_orange, R.drawable.health_body_detail_right_leg_fat_mass_orange}}, new int[][]{new int[]{R.drawable.health_body_detail_head_skeletal_muscle_mass, R.drawable.health_body_detail_trunk_skeletal_muscle_mass, R.drawable.health_body_detail_left_hand_skeletal_muscle_mass, R.drawable.health_body_detail_right_hand_skeletal_muscle_mass, R.drawable.health_body_detail_left_leg_skeletal_muscle_mass, R.drawable.health_body_detail_right_leg_skeletal_muscle_mass}, new int[]{R.drawable.health_body_detail_head_skeletal_muscle_mass, R.drawable.health_body_detail_trunk_skeletal_muscle_mass_blue, R.drawable.health_body_detail_left_hand_skeletal_muscle_mass_blue, R.drawable.health_body_detail_right_hand_skeletal_muscle_mass_blue, R.drawable.health_body_detail_left_leg_skeletal_muscle_mass_blue, R.drawable.health_body_detail_right_leg_skeletal_muscle_mass_blue}, new int[]{R.drawable.health_body_detail_head_skeletal_muscle_mass, R.drawable.health_body_detail_trunk_skeletal_muscle_mass_green, R.drawable.health_body_detail_left_hand_skeletal_muscle_mass_green, R.drawable.health_body_detail_right_hand_skeletal_muscle_mass_green, R.drawable.health_body_detail_left_leg_skeletal_muscle_mass_green, R.drawable.health_body_detail_right_leg_skeletal_muscle_mass_green}, new int[]{R.drawable.health_body_detail_head_skeletal_muscle_mass, R.drawable.health_body_detail_trunk_skeletal_muscle_mass_orange, R.drawable.health_body_detail_left_hand_skeletal_muscle_mass_orange, R.drawable.health_body_detail_right_hand_skeletal_muscle_mass_orange, R.drawable.health_body_detail_left_leg_skeletal_muscle_mass_orange, R.drawable.health_body_detail_right_leg_skeletal_muscle_mass_orange}}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f28183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f28184b;
    private int e;

    private int d(int i) {
        if (i > 5) {
            return 0;
        }
        return i;
    }

    private int e(int i) {
        if (i > 3) {
            return 0;
        }
        return i;
    }

    public HealthBodyDetail(Context context) {
        this(context, null);
        b(context);
    }

    public HealthBodyDetail(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet == null) {
            LogUtil.j("HealthBodyDetail", "HealthBodyDetail AttributeSet is null");
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.health_body_detail);
        try {
            this.e = typedArrayObtainStyledAttributes.getInteger(R.styleable.health_body_detail_body_detail_type, 0);
        } catch (Resources.NotFoundException unused) {
            LogUtil.e("HealthBodyDetail", "HealthBodyDetail Resources NotFoundException");
        }
        typedArrayObtainStyledAttributes.recycle();
        b(context);
    }

    private void b(Context context) {
        if (context == null) {
            LogUtil.j("HealthBodyDetail", "initBodyDetailView Context is null");
            return;
        }
        this.f28184b = context;
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        if (layoutInflater == null) {
            LogUtil.j("HealthBodyDetail", "initBodyDetailView LayoutInflater is null");
            return;
        }
        this.f28183a = layoutInflater.inflate(R.layout.health_body_detail, this);
        setImageView(0, 4);
        setImageView(1, 4);
        setImageView(2, 4);
        setImageView(3, 4);
        setImageView(4, 4);
        setImageView(5, 4);
    }

    private ImageView a(int i) {
        View view = this.f28183a;
        if (view == null) {
            LogUtil.j("HealthBodyDetail", "initImageView View is null");
            return null;
        }
        if (i == 0) {
            return (ImageView) view.findViewById(R.id.health_body_detail_head);
        }
        if (i == 1) {
            return (ImageView) view.findViewById(R.id.health_body_detail_trunk);
        }
        if (i == 2) {
            return (ImageView) view.findViewById(R.id.health_body_detail_left_hand);
        }
        if (i == 3) {
            return (ImageView) view.findViewById(R.id.health_body_detail_right_hand);
        }
        if (i == 4) {
            return (ImageView) view.findViewById(R.id.health_body_detail_left_leg);
        }
        if (i == 5) {
            return (ImageView) view.findViewById(R.id.health_body_detail_right_leg);
        }
        LogUtil.j("HealthBodyDetail", "initImageView id does not exist");
        return null;
    }

    private int getTypeIndex() {
        return this.e == 1 ? 1 : 0;
    }

    public void setType(int i) {
        this.e = i;
    }

    public void setImageView(int i, int i2) {
        ImageView imageViewA = a(i);
        if (imageViewA == null) {
            return;
        }
        imageViewA.setImageResource(f28182c[getTypeIndex()][e(i2)][d(i)]);
    }
}
