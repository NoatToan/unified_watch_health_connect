package n72;

import java.util.Comparator;
import java.util.List;
import n63.w;
import o72.o0;
import p005kotlin.Metadata;
import p13.h0;
import p13.x;
import p3.c2;
import v62.a8;

/* JADX INFO: loaded from: classes9.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f124896a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i53.c<i> f124897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<i> f124898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List<i> f124899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i53.c<i> f124900e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((i) t7).getF124913b(), ((i) t14).getF124913b());
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((i) t7).getF124913b(), ((i) t14).getF124913b());
        }
    }

    static {
        int iA = a();
        e.f124852a.getClass();
        f124897b = i53.a.e(h0.N0(x.k(new r(iA, "Buttons", "Buttons serve as the primary engagement drivers in flow-based and high-importance screens.", null, e.f124856c, 8, null), new r(a(), "Utility Buttons", "App Utility Buttons are for specific use cases when an action a customer may take is optional or not part of a stepped flow. These are and should be used infrequently.", null, e.f124858d, 8, null), new r(a(), "Custom Buttons", "", null, e.f124860e, 8, null), new p(a(), "Bottom Sheet", "Alternative to a menu or a dialog and prevents the user from interacting with the rest of the app", null, e.f124862f, 8, null), new r(a(), "Headers", "Title indicator for sections or content", null, e.f124864g, 8, null), new r(a(), "Cards", "[Update description]", null, e.f124866h, 8, null), new r(a(), "Chips", "Allow the user to filter certain information.", null, e.f124868i, 8, null), new r(a(), "Data Bricks", "Used to call out key data.", null, e.f124869j, 8, null), new r(a(), "List Rows", "Lists are groups of items with actions, shown using text and icons.", null, e.f124870k, 8, null), new r(a(), "List Row Input", "For validated user alphanumeric entry using forms.", null, e.f124871l, 8, null), new r(a(), "List/Card Swipe", "Swipe examples for list and cards", null, e.f124872m, 8, null), new r(a(), "Tag", "Label with highlight background ", null, e.f124873n, 8, null), new r(a(), "Slider", "", null, e.f124874o, 8, null), new r(a(), "Forms", "[Update description]", null, e.f124875p, 8, null), new r(a(), "Dropdown", "Dropdown selection", null, e.f124876q, 8, null), new r(a(), "Progress Indicator", "Shows progress along a line.", null, e.f124877r, 8, null), new r(a(), "Banner", "Combine text with icons and potentially a call to action to orient a user within a new experience and direct them toward action.", null, e.f124878s, 8, null), new r(a(), "Badge", "Displays an icon and a name. The badge can be earned or not, and can display a label indicating that it is new.", null, e.f124879t, 8, null), new r(a(), "Text Badge", "Used to indicate a temporary status, like “Live”, “New”, “In X Days” that will change or go away after a time period.", null, e.f124880u, 8, null), new r(a(), "Utility Banner", "Communicates important information about the state of the entire product or surface—for example, the status of a page, section, dialog, or card. ", null, e.f124881v, 8, null), new p(a(), "Snackbar", "Short messages with an optional action that show up at the bottom of the screen.", null, e.f124882w, 8, null), new p(a(), "Gauges", "Arc (Horseshoe) and Donut chart gauges", null, e.f124883x, 8, null), new r(a(), "Icon Indicators", "Used as map markers, chart markers / decorations and lists.", null, e.f124884y, 8, null)), new a()));
        f124898c = x.k(new p(a(), "All", "", null, e.f124885z, 8, null), new p(a(), "Activity", "Individual Sport Icons", null, e.A, 8, null), new p(a(), "Application", "User Interface Icons", null, e.B, 8, null), new p(a(), "Features", "Feature Specific Icons", null, e.C, 8, null));
        f124899d = x.k(new r(a(), "Interaction Tokens", "Interaction tokens are applied to common interactions and components", null, e.D, 8, null), new r(a(), "Data Viz Palette", "All colors are derived from the Global Palette.", null, e.E, 8, null), new r(a(), "Global Palette", "All colors are derived from the Global Palette.", null, e.F, 8, null));
        r rVar = new r(a(), "Title Bar", "", null, e.G, 8, null);
        r rVar2 = new r(a(), "Empty State", "First use, user cleared, no results, and errors", null, e.H, 8, null);
        int iA2 = a();
        c2 c2Var = o72.c2.f130346a;
        s62.a.f157643a.getClass();
        u4.d dVarA = a8.a(t62.b.f162798a);
        o0.f130507a.getClass();
        f124900e = i53.a.e(h0.N0(x.k(rVar, rVar2, new p(iA2, "Genesis Screen", "A page view gateway to a feature that still needs to be set up and let the user know there are more steps to get started. ", new j(dVarA, "Example Settings", o0.f130508b), e.I), new r(a(), "Dialogs", "", null, e.J, 8, null), new p(a(), "Pickers", "", null, e.K, 8, null), new r(a(), "Hint Tooltip", "Hint tooltips are used to present helpful information the first time a user visits a feature/screen.", null, e.L, 8, null), new r(a(), "Table", "", null, e.M, 8, null), new r(a(), "Tabs", "", null, e.N, 8, null), new r(a(), "Chip Selection", "Groupings of chips and related samples for the selection strategies.", null, e.O, 8, null), new r(a(), "Segmented Control", "Segmented control to limit the results on a dashboard to data that falls in certain groupings.", null, e.P, 8, null), new r(a(), "Social", "Header, Footer, Review", null, e.Q, 8, null), new r(a(), "Promotion", "Upsell Banner, Promotion Announcement", null, e.R, 8, null), new r(a(), "Legend", "Used as a legend for charts and maps.", null, e.S, 8, null), new r(a(), "Map Components", "Map Tooltip", null, e.T, 8, null), new r(a(), "Map Compass", "Interactive compass showing map orientation with auto-hide functionality", null, e.U, 8, null), new p(a(), "Column AnchoredButtonStack", "Custom Column with Anchored Button Stack", null, e.V, 8, null), new r(a(), "Anchored Button Stack", "Fixed buttons used where there is a large amount of content.", null, e.W, 8, null), new p(a(), "Feature Update List", "Promotes key updates to existing features as part of the Feature Awareness flow.", null, e.X, 8, null), new p(a(), "Map Example", "", null, e.Y, 8, null), new r(a(), "Date Range Bar", "Segmented control to limit the results on a dashboard to data that falls in certain date and time groupings.", null, e.Z, 8, null), new n72.a(a(), "Help Screens", "", null, null, new w(2), 24, null), new p(a(), "Pager Navigation", "Pager navigation with Range Control", null, e.f124853a0, 8, null), new p(a(), "Date Pager Navigation", "Date Pager navigation with Range Control", null, e.f124855b0, 8, null), new n72.a(a(), "Reports Date Pager Navigation", "Date Pager navigation with reports data loading", null, null, new w(3), 24, null), new p(a(), "ReportsPage vertical scroll example", "Programmatically scroll to a vertical offset", null, e.f124857c0, 8, null), new r(a(), "Switch Color", "Switch color examples", null, e.f124859d0, 8, null), new r(a(), "Navigation with Transitions", "Navigation with transitions demo", null, e.f124861e0, 8, null), new r(a(), "Chart", "Chart components", null, e.f124863f0, 8, null), new p(a(), "Media Gallery", "Pager for media gallery", null, e.f124865g0, 8, null), new r(a(), "Calendar Week", "This component represents a 7-Day week. ", null, e.f124867h0, 8, null)), new b()));
    }

    public static final int a() {
        int i14 = f124896a;
        f124896a = i14 + 1;
        return i14;
    }
}
