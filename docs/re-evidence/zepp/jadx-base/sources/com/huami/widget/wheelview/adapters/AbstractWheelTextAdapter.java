package com.huami.widget.wheelview.adapters;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractWheelTextAdapter extends AbstractWheelAdapter {
    public static final int DEFAULT_TEXT_COLOR = -15724528;
    public static final int DEFAULT_TEXT_SIZE = 20;
    public static final int LABEL_COLOR = -9437072;
    public static final int NO_RESOURCE = 0;
    public static final int TEXT_VIEW_ITEM_RESOURCE = -1;
    private int b;
    private int c;
    public Context context;
    public int emptyItemResourceId;
    public LayoutInflater inflater;
    public int itemResourceId;
    public int itemTextResourceId;

    public AbstractWheelTextAdapter(Context context) {
        this(context, -1);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x000b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:9:0x000d A[Catch: ClassCastException -> 0x0009, TRY_LEAVE, TryCatch #0 {ClassCastException -> 0x0009, blocks: (B:3:0x0002, B:5:0x0006, B:9:0x000d), top: B:16:0x0002 }] */
    private TextView a(View view, int i) {
        TextView textView;
        if (i == 0) {
            try {
                if (view instanceof TextView) {
                    textView = (TextView) view;
                } else if (i != 0) {
                    textView = (TextView) view.findViewById(i);
                } else {
                    textView = null;
                }
            } catch (ClassCastException e) {
                Log.e("AbstractWheelAdapter", "You must supply a resource ID for a TextView");
                throw new IllegalStateException("AbstractWheelAdapter requires the resource ID to be a TextView", e);
            }
        } else if (i != 0) {
            textView = (TextView) view.findViewById(i);
        } else {
            textView = null;
        }
        return textView;
    }

    private View b(int i, ViewGroup viewGroup) {
        if (i == -1) {
            return new TextView(this.context);
        }
        if (i != 0) {
            return this.inflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public void configureTextView(TextView textView) {
        textView.setGravity(17);
        textView.setTextSize(this.c);
        textView.setLines(1);
        textView.setTypeface(Typeface.SANS_SERIF, 0);
        textView.setPadding(0, 10, 0, 10);
    }

    @Override // com.huami.widget.wheelview.adapters.AbstractWheelAdapter, com.huami.widget.wheelview.adapters.WheelViewAdapter
    public View getEmptyItem(View view, ViewGroup viewGroup) {
        if (view == null) {
            view = b(this.emptyItemResourceId, viewGroup);
        }
        if (this.emptyItemResourceId == -1 && (view instanceof TextView)) {
            configureTextView((TextView) view);
        }
        return view;
    }

    public int getEmptyItemResource() {
        return this.emptyItemResourceId;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public View getItem(int i, View view, ViewGroup viewGroup) {
        if (i < 0 || i >= getItemsCount()) {
            return null;
        }
        if (view == null) {
            view = b(this.itemResourceId, viewGroup);
        }
        TextView textViewA = a(view, this.itemTextResourceId);
        if (textViewA != null) {
            CharSequence itemText = getItemText(i);
            if (itemText == null) {
                itemText = "";
            }
            textViewA.setText(itemText);
            if (this.itemResourceId == -1) {
                configureTextView(textViewA);
            }
        }
        return view;
    }

    public int getItemResource() {
        return this.itemResourceId;
    }

    public abstract CharSequence getItemText(int i);

    public int getItemTextResource() {
        return this.itemTextResourceId;
    }

    public int getTextColor() {
        return this.b;
    }

    public int getTextSize() {
        return this.c;
    }

    public void setEmptyItemResource(int i) {
        this.emptyItemResourceId = i;
    }

    public void setItemResource(int i) {
        this.itemResourceId = i;
    }

    public void setItemTextResource(int i) {
        this.itemTextResourceId = i;
    }

    public void setTextColor(int i) {
        this.b = i;
    }

    public void setTextSize(int i) {
        this.c = i;
    }

    public AbstractWheelTextAdapter(Context context, int i) {
        this(context, i, 0);
    }

    public AbstractWheelTextAdapter(Context context, int i, int i2) {
        this.b = DEFAULT_TEXT_COLOR;
        this.c = 20;
        this.context = context;
        this.itemResourceId = i;
        this.itemTextResourceId = i2;
        this.inflater = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
