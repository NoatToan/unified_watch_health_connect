package com.google.firebase.platforminfo;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.Dependency;
import com.google.firebase.concurrent.h;
import java.util.Iterator;
import java.util.Set;
import org.apache.commons.io.IOUtils;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultUserAgentPublisher implements UserAgentPublisher {
    private final GlobalLibraryVersionRegistrar gamesSDKRegistrar;
    private final String javaSDKVersionUserAgent;

    public DefaultUserAgentPublisher(Set<LibraryVersion> set, GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar) {
        this.javaSDKVersionUserAgent = toUserAgent(set);
        this.gamesSDKRegistrar = globalLibraryVersionRegistrar;
    }

    public static Component<UserAgentPublisher> component() {
        return Component.builder(UserAgentPublisher.class).add(Dependency.setOf((Class<?>) LibraryVersion.class)).factory(new h(5)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ UserAgentPublisher lambda$component$0(ComponentContainer componentContainer) {
        return new DefaultUserAgentPublisher(componentContainer.setOf(LibraryVersion.class), GlobalLibraryVersionRegistrar.getInstance());
    }

    private static String toUserAgent(Set<LibraryVersion> set) {
        StringBuilder sb3 = new StringBuilder();
        Iterator<LibraryVersion> it = set.iterator();
        while (it.hasNext()) {
            LibraryVersion next = it.next();
            sb3.append(next.getLibraryName());
            sb3.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb3.append(next.getVersion());
            if (it.hasNext()) {
                sb3.append(' ');
            }
        }
        return sb3.toString();
    }

    @Override // com.google.firebase.platforminfo.UserAgentPublisher
    public String getUserAgent() {
        boolean zIsEmpty = this.gamesSDKRegistrar.getRegisteredVersions().isEmpty();
        String str = this.javaSDKVersionUserAgent;
        if (zIsEmpty) {
            return str;
        }
        return str + ' ' + toUserAgent(this.gamesSDKRegistrar.getRegisteredVersions());
    }
}
