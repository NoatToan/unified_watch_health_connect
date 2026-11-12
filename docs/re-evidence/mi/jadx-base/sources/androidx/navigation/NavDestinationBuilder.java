package androidx.navigation;

import androidx.navigation.d;
import com.miui.tsmclient.entity.RKE;
import com.xiaomi.onetrack.OneTrack;
import defpackage.cig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0017\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003B!\u0012\u000e\u0010-\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000,\u0012\b\b\u0001\u00101\u001a\u00020\u0013¢\u0006\u0004\b5\u00106J.\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u000e\u001a\u00020\b2\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000e\u0010\u0012J.\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020#0\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\"\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020*0\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010%R\"\u0010-\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000,8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u00101\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00067"}, d2 = {"Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/d;", "D", "", "", "name", "Lkotlin/Function1;", "Landroidx/navigation/NavArgumentBuilder;", "", "Lkotlin/ExtensionFunctionType;", "argumentBuilder", "argument", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "uriPattern", "deepLink", "(Ljava/lang/String;)V", "Landroidx/navigation/NavDeepLinkDslBuilder;", "navDeepLink", "(Lkotlin/jvm/functions/Function1;)V", "", RKE.KEY_ACTION_ID, "Landroidx/navigation/NavActionBuilder;", "actionBuilder", "action", "(ILkotlin/jvm/functions/Function1;)V", OneTrack.Param.BUILD, "()Landroidx/navigation/d;", "", "label", "Ljava/lang/CharSequence;", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "", "Landroidx/navigation/b;", "arguments", "Ljava/util/Map;", "", "Landroidx/navigation/c;", "deepLinks", "Ljava/util/List;", "Lcig;", "actions", "Landroidx/navigation/i;", "navigator", "Landroidx/navigation/i;", "getNavigator", "()Landroidx/navigation/i;", "id", "I", "getId", "()I", "<init>", "(Landroidx/navigation/i;I)V", "navigation-common-ktx_release"}, k = 1, mv = {1, 4, 0})
public class NavDestinationBuilder<D extends d> {
    private final int id;

    @Nullable
    private CharSequence label;

    @NotNull
    private final i<? extends D> navigator;
    private Map<String, b> arguments = new LinkedHashMap();
    private List<c> deepLinks = new ArrayList();
    private Map<Integer, cig> actions = new LinkedHashMap();

    public NavDestinationBuilder(@NotNull i<? extends D> iVar, int i) {
        this.navigator = iVar;
        this.id = i;
    }

    public final void action(int actionId, @NotNull Function1<? super NavActionBuilder, Unit> actionBuilder) {
        Map<Integer, cig> map = this.actions;
        Integer numValueOf = Integer.valueOf(actionId);
        NavActionBuilder navActionBuilder = new NavActionBuilder();
        actionBuilder.invoke2(navActionBuilder);
        map.put(numValueOf, navActionBuilder.build$navigation_common_ktx_release());
    }

    public final void argument(@NotNull String name, @NotNull Function1<? super NavArgumentBuilder, Unit> argumentBuilder) {
        Map<String, b> map = this.arguments;
        NavArgumentBuilder navArgumentBuilder = new NavArgumentBuilder();
        argumentBuilder.invoke2(navArgumentBuilder);
        map.put(name, navArgumentBuilder.build());
    }

    @NotNull
    public D build() {
        D d = (D) this.navigator.a();
        d.w(this.id);
        d.x(this.label);
        for (Map.Entry<String, b> entry : this.arguments.entrySet()) {
            d.e(entry.getKey(), entry.getValue());
        }
        Iterator<T> it = this.deepLinks.iterator();
        while (it.hasNext()) {
            d.f((c) it.next());
        }
        for (Map.Entry<Integer, cig> entry2 : this.actions.entrySet()) {
            d.v(entry2.getKey().intValue(), entry2.getValue());
        }
        return d;
    }

    public final void deepLink(@NotNull String uriPattern) {
        this.deepLinks.add(new c(uriPattern));
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final CharSequence getLabel() {
        return this.label;
    }

    @NotNull
    public final i<? extends D> getNavigator() {
        return this.navigator;
    }

    public final void setLabel(@Nullable CharSequence charSequence) {
        this.label = charSequence;
    }

    public final void deepLink(@NotNull Function1<? super NavDeepLinkDslBuilder, Unit> navDeepLink) {
        List<c> list = this.deepLinks;
        NavDeepLinkDslBuilder navDeepLinkDslBuilder = new NavDeepLinkDslBuilder();
        navDeepLink.invoke2(navDeepLinkDslBuilder);
        list.add(navDeepLinkDslBuilder.build$navigation_common_ktx_release());
    }
}
