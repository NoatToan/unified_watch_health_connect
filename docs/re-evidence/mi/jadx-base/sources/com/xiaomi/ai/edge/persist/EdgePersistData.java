package com.xiaomi.ai.edge.persist;

import com.xiaomi.ai.domain.phonecall.contact.Contact;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class EdgePersistData {
    public String appDataStr;
    public List<Contact> contactList;
    public HashMap<String, byte[]> hotQueryMap;
    String version = "1.0.135";

    public void print() {
        PrintStream printStream = System.out;
        printStream.println("========= persist data ========");
        printStream.println("Version: " + this.version);
        StringBuilder sb = new StringBuilder();
        sb.append("Contact List: ");
        List<Contact> list = this.contactList;
        sb.append(list != null ? Integer.valueOf(list.size()) : null);
        printStream.println(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Hot Query: ");
        HashMap<String, byte[]> map = this.hotQueryMap;
        sb2.append(map != null ? Integer.valueOf(map.size()) : null);
        printStream.println(sb2.toString());
        printStream.println("App Data: " + this.appDataStr);
        printStream.println("===============================");
    }
}
