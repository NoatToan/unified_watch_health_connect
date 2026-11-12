package com.google.firebase.platforminfo;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import io.netty.util.internal.StringUtil;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultUserAgentPublisher implements UserAgentPublisher {
    private final String a;
    private final GlobalLibraryVersionRegistrar b;

    public DefaultUserAgentPublisher(Set<b> set, GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar) {
        this.a = c(set);
        this.b = globalLibraryVersionRegistrar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ UserAgentPublisher b(ComponentContainer componentContainer) {
        return new DefaultUserAgentPublisher(componentContainer.setOf(b.class), GlobalLibraryVersionRegistrar.getInstance());
    }

    private static String c(Set<b> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<b> it2 = set.iterator();
        while (it2.hasNext()) {
            b next = it2.next();
            sb.append(next.b());
            sb.append('/');
            sb.append(next.c());
            if (it2.hasNext()) {
                sb.append(StringUtil.SPACE);
            }
        }
        return sb.toString();
    }

    public static Component<UserAgentPublisher> component() {
        return Component.builder(UserAgentPublisher.class).add(Dependency.setOf(b.class)).factory(new ComponentFactory() { // from class: f61
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return DefaultUserAgentPublisher.b(componentContainer);
            }
        }).build();
    }

    @Override // com.google.firebase.platforminfo.UserAgentPublisher
    public String getUserAgent() {
        if (this.b.a().isEmpty()) {
            return this.a;
        }
        return this.a + StringUtil.SPACE + c(this.b.a());
    }
}
