package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.w0;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements o.a, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f4673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f4674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RadioButton f4675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f4676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CheckBox f4677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f4678f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f4679g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f4680h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f4681i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Drawable f4682j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f4683k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f4684l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4685m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Drawable f4686n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f4687o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LayoutInflater f4688p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f4689q;

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet);
        w0 w0VarG = w0.g(getContext(), attributeSet, h.a.f80439s, i14, 0);
        this.f4682j = w0VarG.b(5);
        TypedArray typedArray = w0VarG.f5271b;
        this.f4683k = typedArray.getResourceId(1, -1);
        this.f4685m = typedArray.getBoolean(7, false);
        this.f4684l = context;
        this.f4686n = w0VarG.b(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, com.garmin.android.apps.connectmobile.R.attr.dropDownListViewStyle, 0);
        this.f4687o = typedArrayObtainStyledAttributes.hasValue(0);
        w0VarG.h();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f4688p == null) {
            this.f4688p = LayoutInflater.from(getContext());
        }
        return this.f4688p;
    }

    private void setSubMenuArrowVisible(boolean z14) {
        ImageView imageView = this.f4679g;
        if (imageView != null) {
            imageView.setVisibility(z14 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f4680h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f4680h.getLayoutParams();
        rect.top = this.f4680h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public j getItemData() {
        return this.f4673a;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    @Override // androidx.appcompat.view.menu.o.a
    public final void initialize(j jVar, int i14) {
        boolean z14;
        int i15;
        String string;
        boolean z15;
        this.f4673a = jVar;
        boolean zIsVisible = jVar.isVisible();
        h hVar = jVar.f4786n;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(jVar.f4777e);
        setCheckable(jVar.isCheckable());
        if (hVar.isShortcutsVisible()) {
            if ((hVar.isQwertyMode() ? jVar.f4782j : jVar.f4780h) != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
        } else {
            z14 = false;
        }
        hVar.isQwertyMode();
        if (z14) {
            j jVar2 = this.f4673a;
            h hVar2 = jVar2.f4786n;
            if (hVar2.isShortcutsVisible()) {
                if ((hVar2.isQwertyMode() ? jVar2.f4782j : jVar2.f4780h) != 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            } else {
                z15 = false;
            }
            i15 = z15 ? 0 : 8;
        }
        if (i15 == 0) {
            TextView textView = this.f4678f;
            j jVar3 = this.f4673a;
            h hVar3 = jVar3.f4786n;
            char c14 = hVar3.isQwertyMode() ? jVar3.f4782j : jVar3.f4780h;
            if (c14 == 0) {
                string = "";
            } else {
                Resources resources = hVar3.getContext().getResources();
                StringBuilder sb3 = new StringBuilder();
                if (ViewConfiguration.get(hVar3.getContext()).hasPermanentMenuKey()) {
                    sb3.append(resources.getString(com.garmin.android.apps.connectmobile.R.string.abc_prepend_shortcut_label));
                }
                int i16 = hVar3.isQwertyMode() ? jVar3.f4783k : jVar3.f4781i;
                j.c(i16, 65536, resources.getString(com.garmin.android.apps.connectmobile.R.string.abc_menu_meta_shortcut_label), sb3);
                j.c(i16, 4096, resources.getString(com.garmin.android.apps.connectmobile.R.string.abc_menu_ctrl_shortcut_label), sb3);
                j.c(i16, 2, resources.getString(com.garmin.android.apps.connectmobile.R.string.abc_menu_alt_shortcut_label), sb3);
                j.c(i16, 1, resources.getString(com.garmin.android.apps.connectmobile.R.string.abc_menu_shift_shortcut_label), sb3);
                j.c(i16, 4, resources.getString(com.garmin.android.apps.connectmobile.R.string.abc_menu_sym_shortcut_label), sb3);
                j.c(i16, 8, resources.getString(com.garmin.android.apps.connectmobile.R.string.abc_menu_function_shortcut_label), sb3);
                if (c14 == '\b') {
                    sb3.append(resources.getString(com.garmin.android.apps.connectmobile.R.string.abc_menu_delete_shortcut_label));
                } else if (c14 == '\n') {
                    sb3.append(resources.getString(com.garmin.android.apps.connectmobile.R.string.abc_menu_enter_shortcut_label));
                } else if (c14 != ' ') {
                    sb3.append(c14);
                } else {
                    sb3.append(resources.getString(com.garmin.android.apps.connectmobile.R.string.abc_menu_space_shortcut_label));
                }
                string = sb3.toString();
            }
            textView.setText(string);
        }
        if (this.f4678f.getVisibility() != i15) {
            this.f4678f.setVisibility(i15);
        }
        setIcon(jVar.getIcon());
        setEnabled(jVar.isEnabled());
        setSubMenuArrowVisible(jVar.hasSubMenu());
        setContentDescription(jVar.f4789q);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f4682j);
        TextView textView = (TextView) findViewById(com.garmin.android.apps.connectmobile.R.id.title);
        this.f4676d = textView;
        int i14 = this.f4683k;
        if (i14 != -1) {
            textView.setTextAppearance(this.f4684l, i14);
        }
        this.f4678f = (TextView) findViewById(com.garmin.android.apps.connectmobile.R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(com.garmin.android.apps.connectmobile.R.id.submenuarrow);
        this.f4679g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f4686n);
        }
        this.f4680h = (ImageView) findViewById(com.garmin.android.apps.connectmobile.R.id.group_divider);
        this.f4681i = (LinearLayout) findViewById(com.garmin.android.apps.connectmobile.R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i14, int i15) {
        if (this.f4674b != null && this.f4685m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f4674b.getLayoutParams();
            int i16 = layoutParams.height;
            if (i16 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i16;
            }
        }
        super.onMeasure(i14, i15);
    }

    public void setCheckable(boolean z14) {
        CompoundButton compoundButton;
        View view2;
        if (!z14 && this.f4675c == null && this.f4677e == null) {
            return;
        }
        if ((this.f4673a.f4796x & 4) != 0) {
            if (this.f4675c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(com.garmin.android.apps.connectmobile.R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f4675c = radioButton;
                LinearLayout linearLayout = this.f4681i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f4675c;
            view2 = this.f4677e;
        } else {
            if (this.f4677e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(com.garmin.android.apps.connectmobile.R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f4677e = checkBox;
                LinearLayout linearLayout2 = this.f4681i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f4677e;
            view2 = this.f4675c;
        }
        if (z14) {
            compoundButton.setChecked(this.f4673a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view2 == null || view2.getVisibility() == 8) {
                return;
            }
            view2.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f4677e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f4675c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z14) {
        CompoundButton compoundButton;
        if ((this.f4673a.f4796x & 4) != 0) {
            if (this.f4675c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(com.garmin.android.apps.connectmobile.R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f4675c = radioButton;
                LinearLayout linearLayout = this.f4681i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f4675c;
        } else {
            if (this.f4677e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(com.garmin.android.apps.connectmobile.R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f4677e = checkBox;
                LinearLayout linearLayout2 = this.f4681i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f4677e;
        }
        compoundButton.setChecked(z14);
    }

    public void setForceShowIcon(boolean z14) {
        this.f4689q = z14;
        this.f4685m = z14;
    }

    public void setGroupDividerEnabled(boolean z14) {
        ImageView imageView = this.f4680h;
        if (imageView != null) {
            imageView.setVisibility((this.f4687o || !z14) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z14 = this.f4673a.f4786n.getOptionalIconsVisible() || this.f4689q;
        if (z14 || this.f4685m) {
            ImageView imageView = this.f4674b;
            if (imageView == null && drawable == null && !this.f4685m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(com.garmin.android.apps.connectmobile.R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f4674b = imageView2;
                LinearLayout linearLayout = this.f4681i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f4685m) {
                this.f4674b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f4674b;
            if (!z14) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f4674b.getVisibility() != 0) {
                this.f4674b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.f4676d;
        if (charSequence == null) {
            if (textView.getVisibility() != 8) {
                this.f4676d.setVisibility(8);
            }
        } else {
            textView.setText(charSequence);
            if (this.f4676d.getVisibility() != 0) {
                this.f4676d.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.garmin.android.apps.connectmobile.R.attr.listMenuViewStyle);
    }
}
