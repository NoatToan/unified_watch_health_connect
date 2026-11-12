package per.wsj.library;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.RatingBar;

/* JADX INFO: loaded from: classes23.dex */
@SuppressLint({"AppCompatCustomView"})
public class AndRatingBar extends RatingBar implements RatingBar.OnRatingBarChangeListener {
    private ColorStateList a;
    private ColorStateList b;
    private ColorStateList c;
    private int d;
    private int e;
    private boolean f;
    private float g;
    private float h;
    private boolean i;
    private StarDrawable j;
    private OnRatingChangeListener k;
    private float l;

    public interface OnRatingChangeListener {
        void onRatingChanged(AndRatingBar ratingBar, float rating, boolean fromUser);
    }

    public AndRatingBar(Context context) {
        this(context, null);
    }

    private void a(Context context, AttributeSet attrs, int defStyleAttr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.AndRatingBar, defStyleAttr, 0);
        this.i = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AndRatingBar_right2Left, false);
        int i = R.styleable.AndRatingBar_starColor;
        if (typedArrayObtainStyledAttributes.hasValue(i)) {
            if (this.i) {
                this.c = typedArrayObtainStyledAttributes.getColorStateList(i);
            } else {
                this.a = typedArrayObtainStyledAttributes.getColorStateList(i);
            }
        }
        int i2 = R.styleable.AndRatingBar_subStarColor;
        if (typedArrayObtainStyledAttributes.hasValue(i2) && !this.i) {
            this.b = typedArrayObtainStyledAttributes.getColorStateList(i2);
        }
        int i3 = R.styleable.AndRatingBar_bgColor;
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            if (this.i) {
                this.a = typedArrayObtainStyledAttributes.getColorStateList(i3);
            } else {
                this.c = typedArrayObtainStyledAttributes.getColorStateList(i3);
            }
        }
        this.f = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AndRatingBar_keepOriginColor, false);
        this.g = typedArrayObtainStyledAttributes.getFloat(R.styleable.AndRatingBar_scaleFactor, 1.0f);
        this.h = typedArrayObtainStyledAttributes.getDimension(R.styleable.AndRatingBar_starSpacing, 0.0f);
        int i4 = R.styleable.AndRatingBar_starDrawable;
        int i5 = R.drawable.ic_rating_star_solid;
        this.d = typedArrayObtainStyledAttributes.getResourceId(i4, i5);
        int i6 = R.styleable.AndRatingBar_bgDrawable;
        if (typedArrayObtainStyledAttributes.hasValue(i6)) {
            this.e = typedArrayObtainStyledAttributes.getResourceId(i6, i5);
        } else {
            this.e = this.d;
        }
        typedArrayObtainStyledAttributes.recycle();
        StarDrawable starDrawable = new StarDrawable(new RattingAttr(context, getNumStars(), this.e, this.d, this.c, this.b, this.a, this.f));
        this.j = starDrawable;
        setProgressDrawable(starDrawable);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int measuredHeight = getMeasuredHeight();
        setMeasuredDimension(RatingBar.resolveSizeAndState(Math.round(measuredHeight * this.j.getTileRatio() * getNumStars() * this.g) + ((int) ((getNumStars() - 1) * this.h)), widthMeasureSpec, 0), measuredHeight);
    }

    @Override // android.widget.RatingBar.OnRatingBarChangeListener
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        OnRatingChangeListener onRatingChangeListener = this.k;
        if (onRatingChangeListener != null && rating != this.l) {
            if (this.i) {
                onRatingChangeListener.onRatingChanged(this, getNumStars() - rating, fromUser);
            } else {
                onRatingChangeListener.onRatingChanged(this, rating, fromUser);
            }
        }
        this.l = rating;
    }

    @Override // android.widget.RatingBar
    public void setNumStars(int numStars) {
        super.setNumStars(numStars);
        StarDrawable starDrawable = this.j;
        if (starDrawable != null) {
            starDrawable.setStarCount(numStars);
        }
    }

    public void setOnRatingChangeListener(OnRatingChangeListener listener) {
        this.k = listener;
        setOnRatingBarChangeListener(this);
    }

    @Override // android.widget.RatingBar
    public void setRating(float rating) {
        super.setRating(rating);
        if (this.i) {
            super.setRating(getNumStars() - getRating());
        }
    }

    public void setScaleFactor(float scaleFactor) {
        this.g = scaleFactor;
        requestLayout();
    }

    public void setStarSpacing(float starSpacing) {
        this.h = starSpacing;
        requestLayout();
    }

    public AndRatingBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        a(context, attrs, 0);
    }

    public AndRatingBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        a(context, attrs, defStyleAttr);
    }
}
