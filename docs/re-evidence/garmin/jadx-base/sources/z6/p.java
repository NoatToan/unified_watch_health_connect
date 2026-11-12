package z6;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PendingIntent f202665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PendingIntent f202666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IconCompat f202667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f202668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f202669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f202670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f202671g;

    public static class a {
        private a() {
        }

        public static p a(Notification.BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
                return null;
            }
            PendingIntent intent = bubbleMetadata.getIntent();
            Icon icon = bubbleMetadata.getIcon();
            PorterDuff.Mode mode = IconCompat.f6391k;
            c cVar = new c(intent, IconCompat.a.a(icon));
            cVar.b(1, bubbleMetadata.getAutoExpandBubble());
            cVar.f202677f = bubbleMetadata.getDeleteIntent();
            cVar.b(2, bubbleMetadata.isNotificationSuppressed());
            if (bubbleMetadata.getDesiredHeight() != 0) {
                cVar.f202674c = Math.max(bubbleMetadata.getDesiredHeight(), 0);
                cVar.f202675d = 0;
            }
            if (bubbleMetadata.getDesiredHeightResId() != 0) {
                cVar.f202675d = bubbleMetadata.getDesiredHeightResId();
                cVar.f202674c = 0;
            }
            return cVar.a();
        }

        public static Notification.BubbleMetadata b(p pVar) {
            PendingIntent pendingIntent;
            if (pVar == null || (pendingIntent = pVar.f202665a) == null) {
                return null;
            }
            Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(pVar.f202667c.f(null)).setIntent(pendingIntent).setDeleteIntent(pVar.f202666b).setAutoExpandBubble((pVar.f202670f & 1) != 0).setSuppressNotification((pVar.f202670f & 2) != 0);
            int i14 = pVar.f202668d;
            if (i14 != 0) {
                suppressNotification.setDesiredHeight(i14);
            }
            int i15 = pVar.f202669e;
            if (i15 != 0) {
                suppressNotification.setDesiredHeightResId(i15);
            }
            return suppressNotification.build();
        }
    }

    public static class b {
        private b() {
        }

        public static p a(Notification.BubbleMetadata bubbleMetadata) {
            c cVar;
            if (bubbleMetadata == null) {
                return null;
            }
            if (bubbleMetadata.getShortcutId() != null) {
                cVar = new c(bubbleMetadata.getShortcutId());
            } else {
                PendingIntent intent = bubbleMetadata.getIntent();
                Icon icon = bubbleMetadata.getIcon();
                PorterDuff.Mode mode = IconCompat.f6391k;
                cVar = new c(intent, IconCompat.a.a(icon));
            }
            cVar.b(1, bubbleMetadata.getAutoExpandBubble());
            cVar.f202677f = bubbleMetadata.getDeleteIntent();
            cVar.b(2, bubbleMetadata.isNotificationSuppressed());
            if (bubbleMetadata.getDesiredHeight() != 0) {
                cVar.f202674c = Math.max(bubbleMetadata.getDesiredHeight(), 0);
                cVar.f202675d = 0;
            }
            if (bubbleMetadata.getDesiredHeightResId() != 0) {
                cVar.f202675d = bubbleMetadata.getDesiredHeightResId();
                cVar.f202674c = 0;
            }
            return cVar.a();
        }

        public static Notification.BubbleMetadata b(p pVar) {
            if (pVar == null) {
                return null;
            }
            String str = pVar.f202671g;
            Notification.BubbleMetadata.Builder builder = str != null ? new Notification.BubbleMetadata.Builder(str) : new Notification.BubbleMetadata.Builder(pVar.f202665a, pVar.f202667c.f(null));
            builder.setDeleteIntent(pVar.f202666b).setAutoExpandBubble((pVar.f202670f & 1) != 0).setSuppressNotification((pVar.f202670f & 2) != 0);
            int i14 = pVar.f202668d;
            if (i14 != 0) {
                builder.setDesiredHeight(i14);
            }
            int i15 = pVar.f202669e;
            if (i15 != 0) {
                builder.setDesiredHeightResId(i15);
            }
            return builder.build();
        }
    }

    private p(PendingIntent pendingIntent, PendingIntent pendingIntent2, IconCompat iconCompat, int i14, int i15, int i16, String str) {
        this.f202665a = pendingIntent;
        this.f202667c = iconCompat;
        this.f202668d = i14;
        this.f202669e = i15;
        this.f202666b = pendingIntent2;
        this.f202670f = i16;
        this.f202671g = str;
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PendingIntent f202672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final IconCompat f202673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f202674c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f202675d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f202676e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public PendingIntent f202677f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f202678g;

        public c(PendingIntent pendingIntent, IconCompat iconCompat) {
            if (pendingIntent == null) {
                j20.x.l("Bubble requires non-null pending intent");
                throw null;
            }
            if (iconCompat == null) {
                j20.x.l("Bubbles require non-null icon");
                throw null;
            }
            this.f202672a = pendingIntent;
            this.f202673b = iconCompat;
        }

        public final p a() {
            String str = this.f202678g;
            if (str == null && this.f202672a == null) {
                j20.x.l("Must supply pending intent or shortcut to bubble");
                return null;
            }
            if (str == null && this.f202673b == null) {
                j20.x.l("Must supply an icon or shortcut for the bubble");
                return null;
            }
            p pVar = new p(this.f202672a, this.f202677f, this.f202673b, this.f202674c, this.f202675d, this.f202676e, str);
            pVar.f202670f = this.f202676e;
            return pVar;
        }

        public final void b(int i14, boolean z14) {
            int i15 = this.f202676e;
            if (z14) {
                this.f202676e = i14 | i15;
            } else {
                this.f202676e = (~i14) & i15;
            }
        }

        public c(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f202678g = str;
            } else {
                j20.x.l("Bubble requires a non-null shortcut id");
                throw null;
            }
        }

        @Deprecated
        public c() {
        }
    }
}
