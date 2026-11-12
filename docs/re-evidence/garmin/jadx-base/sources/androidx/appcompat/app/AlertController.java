package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.garmin.android.apps.connectmobile.R;
import i.l;
import java.lang.ref.WeakReference;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public class AlertController {
    public NestedScrollView A;
    public Drawable C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public View G;
    public ListAdapter H;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final boolean O;
    public final c P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f4591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Window f4592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f4594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f4595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RecycleListView f4596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f4597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4598i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4599j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4600k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4601l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4602m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f4604o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f4605p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Message f4606q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Drawable f4607r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Button f4608s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public CharSequence f4609t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Message f4610u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Drawable f4611v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Button f4612w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CharSequence f4613x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Message f4614y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Drawable f4615z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4603n = false;
    public int B = 0;
    public int I = -1;
    public final a Q = new a();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            Message messageObtain;
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            if (view2 == alertController.f4604o && (message3 = alertController.f4606q) != null) {
                messageObtain = Message.obtain(message3);
            } else if (view2 != alertController.f4608s || (message2 = alertController.f4610u) == null) {
                messageObtain = (view2 != alertController.f4612w || (message = alertController.f4614y) == null) ? null : Message.obtain(message);
            } else {
                messageObtain = Message.obtain(message2);
            }
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            alertController.P.obtainMessage(1, alertController.f4591b).sendToTarget();
        }
    }

    public static class b {
        public int A;
        public int B;
        public int C;
        public boolean[] E;
        public boolean F;
        public boolean G;
        public DialogInterface.OnMultiChoiceClickListener I;
        public Cursor J;
        public String K;
        public String L;
        public AdapterView.OnItemSelectedListener M;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f4619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LayoutInflater f4620b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Drawable f4622d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CharSequence f4623e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public View f4624f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public CharSequence f4625g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CharSequence f4626h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Drawable f4627i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public DialogInterface.OnClickListener f4628j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public CharSequence f4629k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Drawable f4630l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public DialogInterface.OnClickListener f4631m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public CharSequence f4632n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Drawable f4633o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public DialogInterface.OnClickListener f4634p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public DialogInterface.OnCancelListener f4636r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public DialogInterface.OnDismissListener f4637s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public DialogInterface.OnKeyListener f4638t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public CharSequence[] f4639u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public ListAdapter f4640v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public DialogInterface.OnClickListener f4641w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f4642x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public View f4643y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f4644z;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4621c = 0;
        public boolean D = false;
        public int H = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f4635q = true;

        public b(Context context) {
            this.f4619a = context;
            this.f4620b = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    public static final class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<DialogInterface> f4645a;

        public c(DialogInterface dialogInterface) {
            this.f4645a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i14 = message.what;
            if (i14 == -3 || i14 == -2 || i14 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f4645a.get(), message.what);
            } else {
                if (i14 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static class d extends ArrayAdapter<CharSequence> {
        public d(Context context, int i14, int i15, CharSequence[] charSequenceArr) {
            super(context, i14, i15, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final long getItemId(int i14) {
            return i14;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, l lVar, Window window) {
        this.f4590a = context;
        this.f4591b = lVar;
        this.f4592c = window;
        this.P = new c(lVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, h.a.f80425e, R.attr.alertDialogStyle, 0);
        this.J = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.K = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.L = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.M = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.N = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.O = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f4593d = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        lVar.supportRequestWindowFeature(1);
    }

    public static boolean a(View view2) {
        if (view2.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view2 instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view2;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view2, View view3) {
        if (view2 == null) {
            if (view3 instanceof ViewStub) {
                view3 = ((ViewStub) view3).inflate();
            }
            return (ViewGroup) view3;
        }
        if (view3 != null) {
            ViewParent parent = view3.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view3);
            }
        }
        if (view2 instanceof ViewStub) {
            view2 = ((ViewStub) view2).inflate();
        }
        return (ViewGroup) view2;
    }

    public final void c(int i14, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Drawable drawable) {
        Message messageObtainMessage = onClickListener != null ? this.P.obtainMessage(i14, onClickListener) : null;
        if (i14 == -3) {
            this.f4613x = charSequence;
            this.f4614y = messageObtainMessage;
            this.f4615z = drawable;
        } else if (i14 == -2) {
            this.f4609t = charSequence;
            this.f4610u = messageObtainMessage;
            this.f4611v = drawable;
        } else {
            if (i14 != -1) {
                h.s("Button does not exist");
                return;
            }
            this.f4605p = charSequence;
            this.f4606q = messageObtainMessage;
            this.f4607r = drawable;
        }
    }

    public final void d(int i14) {
        this.C = null;
        this.B = i14;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (i14 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageResource(this.B);
            }
        }
    }

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4617b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f80441u);
            this.f4617b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f4616a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }

        public RecycleListView(Context context) {
            this(context, null);
        }
    }
}
