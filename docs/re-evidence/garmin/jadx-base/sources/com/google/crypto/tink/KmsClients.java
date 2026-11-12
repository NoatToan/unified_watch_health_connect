package com.google.crypto.tink;

import fb1.c;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class KmsClients {
    private static List<KmsClient> autoClients;
    private static final CopyOnWriteArrayList<KmsClient> clients = new CopyOnWriteArrayList<>();

    public static void add(KmsClient kmsClient) {
        clients.add(kmsClient);
    }

    public static KmsClient get(String str) throws GeneralSecurityException {
        for (KmsClient kmsClient : clients) {
            if (kmsClient.doesSupport(str)) {
                return kmsClient;
            }
        }
        throw new GeneralSecurityException(c.n("No KMS client does support: ", str));
    }

    public static synchronized KmsClient getAutoLoaded(String str) {
        KmsClient next;
        try {
            if (autoClients == null) {
                autoClients = loadAutoKmsClients();
            }
            Iterator<KmsClient> it = autoClients.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (next.doesSupport(str)) {
                }
            }
            throw new GeneralSecurityException("No KMS client does support: " + str);
        } catch (Throwable th3) {
            throw th3;
        }
        return next;
    }

    private static List<KmsClient> loadAutoKmsClients() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ServiceLoader.load(KmsClient.class).iterator();
        while (it.hasNext()) {
            arrayList.add((KmsClient) it.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
