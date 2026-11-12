package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import defpackage.u4j;

/* JADX INFO: loaded from: classes.dex */
public class Placeholder extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f2012b;
    public int c;

    public Placeholder(Context context) {
        super(context);
        this.f2011a = -1;
        this.f2012b = null;
        this.c = 4;
        a(null);
    }

    public final void a(AttributeSet attributeSet) {
        super.setVisibility(this.c);
        this.f2011a = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, u4j.C3);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == u4j.D3) {
                    this.f2011a = typedArrayObtainStyledAttributes.getResourceId(index, this.f2011a);
                } else if (index == u4j.E3) {
                    this.c = typedArrayObtainStyledAttributes.getInt(index, this.c);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f2012b == null) {
            return;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.f2012b.getLayoutParams();
        layoutParams2.v0.n1(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviourC = layoutParams.v0.C();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
        if (dimensionBehaviourC != dimensionBehaviour) {
            layoutParams.v0.o1(layoutParams2.v0.Y());
        }
        if (layoutParams.v0.V() != dimensionBehaviour) {
            layoutParams.v0.P0(layoutParams2.v0.z());
        }
        layoutParams2.v0.n1(8);
    }

    public void c(ConstraintLayout constraintLayout) {
        if (this.f2011a == -1 && !isInEditMode()) {
            setVisibility(this.c);
        }
        View viewFindViewById = constraintLayout.findViewById(this.f2011a);
        this.f2012b = viewFindViewById;
        if (viewFindViewById != null) {
            ((ConstraintLayout.LayoutParams) viewFindViewById.getLayoutParams()).j0 = true;
            this.f2012b.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f2012b;
    }

    public int getEmptyVisibility() {
        return this.c;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(SportReportBaseParser.ReportType.targetValueNumber, SportReportBaseParser.ReportType.targetValueNumber, SportReportBaseParser.ReportType.targetValueNumber);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((iHeight / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i) {
        View viewFindViewById;
        if (this.f2011a == i) {
            return;
        }
        View view = this.f2012b;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.LayoutParams) this.f2012b.getLayoutParams()).j0 = false;
            this.f2012b = null;
        }
        this.f2011a = i;
        if (i == -1 || (viewFindViewById = ((View) getParent()).findViewById(i)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i) {
        this.c = i;
    }

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2011a = -1;
        this.f2012b = null;
        this.c = 4;
        a(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2011a = -1;
        this.f2012b = null;
        this.c = 4;
        a(attributeSet);
    }
}
