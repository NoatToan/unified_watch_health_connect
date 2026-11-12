package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.appcompat.internal.app.widget.ActionBarContainer;
import miuix.appcompat.internal.app.widget.ActionBarOverlayLayout;
import miuix.appcompat.internal.app.widget.CollapseTabContainer;
import miuix.appcompat.internal.app.widget.ExpandTabContainer;
import miuix.appcompat.internal.app.widget.SecondaryCollapseTabContainer;
import miuix.appcompat.internal.app.widget.SecondaryExpandTabContainer;
import miuix.appcompat.internal.app.widget.actionbar.CollapseTitle;
import miuix.appcompat.internal.app.widget.actionbar.ExpandTitle;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes3.dex */
public class mi1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f26203a = false;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f26204a;

        public a(Context context) {
            this.f26204a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            mi1.c(this.f26204a);
            mi1.a(this.f26204a);
        }
    }

    public static void a(Context context) {
        try {
            ClassLoader classLoader = context.getClassLoader();
            Class.forName(ActionBarOverlayLayout.class.getName(), true, classLoader);
            Class.forName(ActionBarContainer.class.getName(), true, classLoader);
            Class.forName(ActionBar.c.class.getName(), true, classLoader);
            Class.forName(AnimState.class.getName(), true, classLoader);
            Class.forName(AnimConfig.class.getName(), true, classLoader);
            Class.forName(CollapseTitle.class.getName(), true, classLoader);
            Class.forName(ExpandTitle.class.getName(), true, classLoader);
            Class.forName(CollapseTabContainer.class.getName(), true, classLoader);
            Class.forName(ExpandTabContainer.class.getName(), true, classLoader);
            Class.forName(SecondaryCollapseTabContainer.class.getName(), true, classLoader);
            Class.forName(SecondaryExpandTabContainer.class.getName(), true, classLoader);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void b(Context context) {
        new Thread(new a(context)).start();
    }

    public static void c(Context context) {
        try {
            ClassLoader classLoader = context.getClassLoader();
            Class.forName(FrameLayout.class.getName(), true, classLoader);
            Class.forName(LinearLayout.class.getName(), true, classLoader);
            Class.forName(ImageView.class.getName(), true, classLoader);
            Class.forName(TextView.class.getName(), true, classLoader);
            Class.forName(Button.class.getName(), true, classLoader);
            Class.forName(SpringBackLayout.class.getName(), true, classLoader);
            Class.forName(TypedArray.class.getName(), true, classLoader);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
