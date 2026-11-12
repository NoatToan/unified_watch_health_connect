package com.garmin.android.gncs.settings;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.view.s0;
import com.garmin.android.gncs.GNCSApplicationInfo;
import com.garmin.android.gncs.R;

/* JADX INFO: loaded from: classes11.dex */
class GNCSApplicationAdapter extends ArrayAdapter<AppInfo> {
    private final ItemCallback callback;
    private final Context context;
    private final int disabledTextColor;
    private boolean enabled;
    private final int switchThumb;
    private final int switchThumbTint;
    private final int switchTrack;
    private final int switchTrackTint;
    private final int textColor;
    private final Typeface typeface;

    public interface ItemCallback {
        void onItemStateChanged();
    }

    public GNCSApplicationAdapter(Context context, ItemCallback itemCallback, int i14, int i15, int i16, int i17, int i18, int i19, Typeface typeface) {
        super(context, R.layout.package_item);
        this.enabled = true;
        this.context = context;
        this.callback = itemCallback;
        this.textColor = i14;
        this.disabledTextColor = i15;
        this.switchThumb = i16;
        this.switchTrack = i17;
        this.switchThumbTint = i18;
        this.switchTrackTint = i19;
        this.typeface = typeface;
    }

    private View createView(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(this.context).inflate(R.layout.package_item, viewGroup, false);
        final ViewTag viewTag = new ViewTag(viewInflate, (ImageView) viewInflate.findViewById(R.id.icon), (TextView) viewInflate.findViewById(R.id.text1), (SwitchCompat) viewInflate.findViewById(R.id.enabled), 0);
        viewInflate.setTag(viewTag);
        viewTag.root.setOnClickListener(null);
        viewTag.enabled.setOnCheckedChangeListener(null);
        s0.r(viewTag.text, new androidx.core.view.a() { // from class: com.garmin.android.gncs.settings.GNCSApplicationAdapter.1
            @Override // androidx.core.view.a
            public void onInitializeAccessibilityNodeInfo(View view2, l7.f fVar) {
                super.onInitializeAccessibilityNodeInfo(view2, fVar);
                fVar.m(viewTag.enabled.isChecked());
                fVar.l(true);
                fVar.b(l7.f.a.f110568g);
            }
        });
        viewTag.root.setOnClickListener(new View.OnClickListener() { // from class: com.garmin.android.gncs.settings.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f49898a.lambda$createView$0(viewTag, view2);
            }
        });
        int i14 = this.switchThumb;
        if (i14 != 0) {
            viewTag.enabled.setThumbResource(i14);
        }
        int i15 = this.switchTrack;
        if (i15 != 0) {
            viewTag.enabled.setTrackResource(i15);
        }
        int i16 = this.switchThumbTint;
        if (i16 != 0) {
            viewTag.enabled.setThumbTintList(a7.b.getColorStateList(this.context, i16));
        }
        int i17 = this.switchTrackTint;
        if (i17 != 0) {
            viewTag.enabled.setTrackTintList(a7.b.getColorStateList(this.context, i17));
        }
        viewTag.enabled.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.garmin.android.gncs.settings.b
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
                this.f49900a.lambda$createView$1(viewTag, compoundButton, z14);
            }
        });
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$0(ViewTag viewTag, View view2) {
        AppInfo appInfo = viewTag.appInfo;
        if (appInfo == null || !this.enabled) {
            return;
        }
        appInfo.enabled = !appInfo.enabled;
        ih2.b.b("GNCSApplicationAdapter.setOnClickListener -> Setting package [" + viewTag.appInfo.packageName + "] to enabled " + viewTag.appInfo.enabled);
        ItemCallback itemCallback = this.callback;
        if (itemCallback != null) {
            itemCallback.onItemStateChanged();
        }
        saveAppInfo(viewTag.appInfo);
        notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$1(ViewTag viewTag, CompoundButton compoundButton, boolean z14) {
        AppInfo appInfo = viewTag.appInfo;
        if (appInfo == null || appInfo.enabled == z14) {
            return;
        }
        appInfo.enabled = z14;
        ih2.b.b("GNCSApplicationAdapter.setOnCheckedChangeListener -> Setting package [" + viewTag.appInfo.packageName + "] to enabled " + viewTag.appInfo.enabled);
        ItemCallback itemCallback = this.callback;
        if (itemCallback != null) {
            itemCallback.onItemStateChanged();
        }
        if (compoundButton.isPressed()) {
            saveAppInfo(viewTag.appInfo);
        }
    }

    private void saveAppInfo(AppInfo appInfo) {
        GNCSSettings.getInstance().save(new GNCSApplicationInfo(appInfo.packageName, appInfo.enabled));
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i14, View view2, ViewGroup viewGroup) {
        if (view2 == null) {
            view2 = createView(viewGroup);
        }
        ViewTag viewTag = (ViewTag) view2.getTag();
        Typeface typeface = this.typeface;
        if (typeface != null) {
            viewTag.text.setTypeface(typeface);
        }
        if (getCount() == 0) {
            viewTag.icon.setVisibility(8);
            viewTag.text.setText(this.context.getString(R.string.no_apps_in_category));
            int i15 = this.textColor;
            if (i15 != 0) {
                viewTag.text.setTextColor(a7.b.getColor(this.context, i15));
            }
            viewTag.enabled.setVisibility(8);
            viewTag.appInfo = null;
        } else {
            AppInfo appInfo = (AppInfo) getItem(i14);
            viewTag.appInfo = appInfo;
            if (appInfo != null) {
                Drawable drawable = appInfo.icon;
                ImageView imageView = viewTag.icon;
                if (drawable == null) {
                    imageView.setVisibility(8);
                } else {
                    imageView.setImageDrawable(drawable);
                    viewTag.icon.setVisibility(0);
                }
                viewTag.text.setEnabled(this.enabled);
                viewTag.text.setText(appInfo.displayName);
                if (this.enabled) {
                    int i16 = this.textColor;
                    if (i16 != 0) {
                        viewTag.text.setTextColor(a7.b.getColor(this.context, i16));
                    }
                } else {
                    int i17 = this.disabledTextColor;
                    if (i17 != 0) {
                        viewTag.text.setTextColor(a7.b.getColor(this.context, i17));
                    }
                }
                viewTag.enabled.setEnabled(this.enabled);
                viewTag.enabled.setChecked(appInfo.enabled);
            }
        }
        view2.setBackgroundColor(0);
        viewTag.enabled.setVisibility(0);
        return view2;
    }

    public void setEnabled(boolean z14) {
        this.enabled = z14;
        notifyDataSetChanged();
    }

    public static class ViewTag {
        AppInfo appInfo;
        final SwitchCompat enabled;
        final ImageView icon;
        final View root;
        final TextView text;

        private ViewTag(View view2, ImageView imageView, TextView textView, SwitchCompat switchCompat) {
            this.root = view2;
            this.icon = imageView;
            this.text = textView;
            this.enabled = switchCompat;
        }

        public /* synthetic */ ViewTag(View view2, ImageView imageView, TextView textView, SwitchCompat switchCompat, int i14) {
            this(view2, imageView, textView, switchCompat);
        }
    }
}
