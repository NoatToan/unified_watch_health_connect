package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import io.netty.util.internal.StringUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* JADX INFO: loaded from: classes18.dex */
public final class Request {
    private static final long d = TimeUnit.SECONDS.toNanos(5);
    public int a;
    public long b;
    public int c;
    public final boolean centerCrop;
    public final boolean centerInside;
    public final Bitmap.Config config;
    public final boolean hasRotationPivot;
    public final boolean onlyScaleDown;
    public final Picasso.Priority priority;
    public final int resourceId;
    public final float rotationDegrees;
    public final float rotationPivotX;
    public final float rotationPivotY;
    public final String stableKey;
    public final int targetHeight;
    public final int targetWidth;
    public final List<Transformation> transformations;
    public final Uri uri;

    public static final class Builder {
        private Uri a;
        private int b;
        private String c;
        private int d;
        private int e;
        private boolean f;
        private boolean g;
        private boolean h;
        private float i;
        private float j;
        private float k;
        private boolean l;
        private List<Transformation> m;
        private Bitmap.Config n;
        private Picasso.Priority o;

        public boolean a() {
            return (this.a == null && this.b == 0) ? false : true;
        }

        public boolean b() {
            return this.o != null;
        }

        public Request build() {
            boolean z = this.g;
            if (z && this.f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            }
            if (this.f && this.d == 0 && this.e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            }
            if (z && this.d == 0 && this.e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            }
            if (this.o == null) {
                this.o = Picasso.Priority.NORMAL;
            }
            return new Request(this.a, this.b, this.c, this.m, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.n, this.o);
        }

        public boolean c() {
            return (this.d == 0 && this.e == 0) ? false : true;
        }

        public Builder centerCrop() {
            if (this.g) {
                throw new IllegalStateException("Center crop can not be used after calling centerInside");
            }
            this.f = true;
            return this;
        }

        public Builder centerInside() {
            if (this.f) {
                throw new IllegalStateException("Center inside can not be used after calling centerCrop");
            }
            this.g = true;
            return this;
        }

        public Builder clearCenterCrop() {
            this.f = false;
            return this;
        }

        public Builder clearCenterInside() {
            this.g = false;
            return this;
        }

        public Builder clearOnlyScaleDown() {
            this.h = false;
            return this;
        }

        public Builder clearResize() {
            this.d = 0;
            this.e = 0;
            this.f = false;
            this.g = false;
            return this;
        }

        public Builder clearRotation() {
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = false;
            return this;
        }

        public Builder config(Bitmap.Config config) {
            this.n = config;
            return this;
        }

        public Builder onlyScaleDown() {
            if (this.e == 0 && this.d == 0) {
                throw new IllegalStateException("onlyScaleDown can not be applied without resize");
            }
            this.h = true;
            return this;
        }

        public Builder priority(Picasso.Priority priority) {
            if (priority == null) {
                throw new IllegalArgumentException("Priority invalid.");
            }
            if (this.o != null) {
                throw new IllegalStateException("Priority already set.");
            }
            this.o = priority;
            return this;
        }

        public Builder resize(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            }
            if (i2 == 0 && i == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            }
            this.d = i;
            this.e = i2;
            return this;
        }

        public Builder rotate(float f) {
            this.i = f;
            return this;
        }

        public Builder setResourceId(int i) {
            if (i == 0) {
                throw new IllegalArgumentException("Image resource ID may not be 0.");
            }
            this.b = i;
            this.a = null;
            return this;
        }

        public Builder setUri(Uri uri) {
            if (uri == null) {
                throw new IllegalArgumentException("Image URI may not be null.");
            }
            this.a = uri;
            this.b = 0;
            return this;
        }

        public Builder stableKey(String str) {
            this.c = str;
            return this;
        }

        public Builder transform(Transformation transformation) {
            if (transformation == null) {
                throw new IllegalArgumentException("Transformation must not be null.");
            }
            if (transformation.key() == null) {
                throw new IllegalArgumentException("Transformation key must not be null.");
            }
            if (this.m == null) {
                this.m = new ArrayList(2);
            }
            this.m.add(transformation);
            return this;
        }

        public Builder(Uri uri) {
            setUri(uri);
        }

        public Builder rotate(float f, float f2, float f3) {
            this.i = f;
            this.j = f2;
            this.k = f3;
            this.l = true;
            return this;
        }

        public Builder(int i) {
            setResourceId(i);
        }

        public Builder(Uri uri, int i, Bitmap.Config config) {
            this.a = uri;
            this.b = i;
            this.n = config;
        }

        public Builder transform(List<? extends Transformation> list) {
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    transform(list.get(i));
                }
                return this;
            }
            throw new IllegalArgumentException("Transformation list must not be null.");
        }

        private Builder(Request request) {
            this.a = request.uri;
            this.b = request.resourceId;
            this.c = request.stableKey;
            this.d = request.targetWidth;
            this.e = request.targetHeight;
            this.f = request.centerCrop;
            this.g = request.centerInside;
            this.i = request.rotationDegrees;
            this.j = request.rotationPivotX;
            this.k = request.rotationPivotY;
            this.l = request.hasRotationPivot;
            this.h = request.onlyScaleDown;
            if (request.transformations != null) {
                this.m = new ArrayList(request.transformations);
            }
            this.n = request.config;
            this.o = request.priority;
        }
    }

    public String a() {
        Uri uri = this.uri;
        return uri != null ? String.valueOf(uri.getPath()) : Integer.toHexString(this.resourceId);
    }

    public boolean b() {
        return this.transformations != null;
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public String c() {
        long jNanoTime = System.nanoTime() - this.b;
        if (jNanoTime > d) {
            return f() + '+' + TimeUnit.NANOSECONDS.toSeconds(jNanoTime) + 's';
        }
        return f() + '+' + TimeUnit.NANOSECONDS.toMillis(jNanoTime) + "ms";
    }

    public boolean d() {
        return hasSize() || this.rotationDegrees != 0.0f;
    }

    public boolean e() {
        return d() || b();
    }

    public String f() {
        return "[R" + this.a + JsonLexerKt.END_LIST;
    }

    public boolean hasSize() {
        return (this.targetWidth == 0 && this.targetHeight == 0) ? false : true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i = this.resourceId;
        if (i > 0) {
            sb.append(i);
        } else {
            sb.append(this.uri);
        }
        List<Transformation> list = this.transformations;
        if (list != null && !list.isEmpty()) {
            for (Transformation transformation : this.transformations) {
                sb.append(StringUtil.SPACE);
                sb.append(transformation.key());
            }
        }
        if (this.stableKey != null) {
            sb.append(" stableKey(");
            sb.append(this.stableKey);
            sb.append(')');
        }
        if (this.targetWidth > 0) {
            sb.append(" resize(");
            sb.append(this.targetWidth);
            sb.append(',');
            sb.append(this.targetHeight);
            sb.append(')');
        }
        if (this.centerCrop) {
            sb.append(" centerCrop");
        }
        if (this.centerInside) {
            sb.append(" centerInside");
        }
        if (this.rotationDegrees != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.rotationDegrees);
            if (this.hasRotationPivot) {
                sb.append(" @ ");
                sb.append(this.rotationPivotX);
                sb.append(',');
                sb.append(this.rotationPivotY);
            }
            sb.append(')');
        }
        if (this.config != null) {
            sb.append(StringUtil.SPACE);
            sb.append(this.config);
        }
        sb.append('}');
        return sb.toString();
    }

    private Request(Uri uri, int i, String str, List<Transformation> list, int i2, int i3, boolean z, boolean z2, boolean z3, float f, float f2, float f3, boolean z4, Bitmap.Config config, Picasso.Priority priority) {
        this.uri = uri;
        this.resourceId = i;
        this.stableKey = str;
        if (list == null) {
            this.transformations = null;
        } else {
            this.transformations = Collections.unmodifiableList(list);
        }
        this.targetWidth = i2;
        this.targetHeight = i3;
        this.centerCrop = z;
        this.centerInside = z2;
        this.onlyScaleDown = z3;
        this.rotationDegrees = f;
        this.rotationPivotX = f2;
        this.rotationPivotY = f3;
        this.hasRotationPivot = z4;
        this.config = config;
        this.priority = priority;
    }
}
