package com.google.protobuf.util;

import com.google.common.base.Splitter;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.protobuf.Descriptors;
import com.google.protobuf.FieldMask;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.logging.Logger;
import sn.a;
import v.e0;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
final class FieldMaskTree {
    private static final String FIELD_PATH_SEPARATOR_REGEX = "\\.";
    private static final Logger logger = Logger.getLogger(FieldMaskTree.class.getName());
    private final Node root = new Node();

    public static final class Node {
        final SortedMap<String, Node> children;

        private Node() {
            this.children = new TreeMap();
        }
    }

    public FieldMaskTree(FieldMask fieldMask) {
        mergeFromFieldMask(fieldMask);
    }

    private static void getFieldPaths(Node node, String str, List<String> list) {
        String string;
        if (node.children.isEmpty()) {
            list.add(str);
            return;
        }
        for (Map.Entry<String, Node> entry : node.children.entrySet()) {
            if (str.isEmpty()) {
                string = entry.getKey();
            } else {
                StringBuilder sbI = a.i(str, ".");
                sbI.append(entry.getKey());
                string = sbI.toString();
            }
            getFieldPaths(entry.getValue(), string, list);
        }
    }

    private static void merge(Node node, Message message, Message.Builder builder, FieldMaskUtil.MergeOptions mergeOptions) {
        if (message.getDescriptorForType() != builder.getDescriptorForType()) {
            h.s(e0.g("source (", message.getDescriptorForType().getFullName(), ") and destination (", builder.getDescriptorForType().getFullName(), ") descriptor must be equal"));
            return;
        }
        Descriptors.Descriptor descriptorForType = message.getDescriptorForType();
        for (Map.Entry<String, Node> entry : node.children.entrySet()) {
            Descriptors.FieldDescriptor fieldDescriptorFindFieldByName = descriptorForType.findFieldByName(entry.getKey());
            if (fieldDescriptorFindFieldByName == null) {
                logger.warning("Cannot find field \"" + entry.getKey() + "\" in message type " + descriptorForType.getFullName());
            } else if (entry.getValue().children.isEmpty()) {
                if (fieldDescriptorFindFieldByName.isRepeated()) {
                    if (mergeOptions.replaceRepeatedFields()) {
                        builder.setField(fieldDescriptorFindFieldByName, message.getField(fieldDescriptorFindFieldByName));
                    } else {
                        Iterator it = ((List) message.getField(fieldDescriptorFindFieldByName)).iterator();
                        while (it.hasNext()) {
                            builder.addRepeatedField(fieldDescriptorFindFieldByName, it.next());
                        }
                    }
                } else if (fieldDescriptorFindFieldByName.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                    if (mergeOptions.replaceMessageFields()) {
                        if (message.hasField(fieldDescriptorFindFieldByName)) {
                            builder.setField(fieldDescriptorFindFieldByName, message.getField(fieldDescriptorFindFieldByName));
                        } else {
                            builder.clearField(fieldDescriptorFindFieldByName);
                        }
                    } else if (message.hasField(fieldDescriptorFindFieldByName)) {
                        builder.setField(fieldDescriptorFindFieldByName, ((Message) builder.getField(fieldDescriptorFindFieldByName)).toBuilder().mergeFrom((Message) message.getField(fieldDescriptorFindFieldByName)).build());
                    }
                } else if (message.hasField(fieldDescriptorFindFieldByName) || !mergeOptions.replacePrimitiveFields()) {
                    builder.setField(fieldDescriptorFindFieldByName, message.getField(fieldDescriptorFindFieldByName));
                } else {
                    builder.clearField(fieldDescriptorFindFieldByName);
                }
            } else if (fieldDescriptorFindFieldByName.isRepeated() || fieldDescriptorFindFieldByName.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                logger.warning("Field \"" + fieldDescriptorFindFieldByName.getFullName() + "\" is not a singular message field and cannot have sub-fields.");
            } else if (message.hasField(fieldDescriptorFindFieldByName) || builder.hasField(fieldDescriptorFindFieldByName)) {
                Message.Builder fieldBuilder = builder instanceof GeneratedMessage.Builder ? builder.getFieldBuilder(fieldDescriptorFindFieldByName) : ((Message) builder.getField(fieldDescriptorFindFieldByName)).toBuilder();
                merge(entry.getValue(), (Message) message.getField(fieldDescriptorFindFieldByName), fieldBuilder, mergeOptions);
                builder.setField(fieldDescriptorFindFieldByName, fieldBuilder.buildPartial());
            }
        }
    }

    @CanIgnoreReturnValue
    private static boolean removeFieldPath(Node node, List<String> list, int i14) {
        String str = list.get(i14);
        if (!node.children.containsKey(str)) {
            return false;
        }
        int size = list.size() - 1;
        SortedMap<String, Node> sortedMap = node.children;
        if (i14 == size) {
            sortedMap.remove(str);
            return node.children.isEmpty();
        }
        if (removeFieldPath(sortedMap.get(str), list, i14 + 1)) {
            node.children.remove(str);
        }
        return node.children.isEmpty();
    }

    @CanIgnoreReturnValue
    public FieldMaskTree addFieldPath(String str) {
        String[] strArrSplit = str.split(FIELD_PATH_SEPARATOR_REGEX);
        if (strArrSplit.length != 0) {
            Node node = this.root;
            boolean z14 = false;
            for (String str2 : strArrSplit) {
                if (z14 || node == this.root || !node.children.isEmpty()) {
                    if (node.children.containsKey(str2)) {
                        node = node.children.get(str2);
                    } else {
                        Node node2 = new Node();
                        node.children.put(str2, node2);
                        z14 = true;
                        node = node2;
                    }
                }
            }
            node.children.clear();
            return this;
        }
        return this;
    }

    public void intersectFieldPath(String str, FieldMaskTree fieldMaskTree) {
        if (this.root.children.isEmpty()) {
            return;
        }
        String[] strArrSplit = str.split(FIELD_PATH_SEPARATOR_REGEX);
        if (strArrSplit.length == 0) {
            return;
        }
        Node node = this.root;
        for (String str2 : strArrSplit) {
            if (node != this.root && node.children.isEmpty()) {
                fieldMaskTree.addFieldPath(str);
                return;
            } else {
                if (!node.children.containsKey(str2)) {
                    return;
                }
                node = node.children.get(str2);
            }
        }
        ArrayList arrayList = new ArrayList();
        getFieldPaths(node, str, arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            fieldMaskTree.addFieldPath((String) it.next());
        }
    }

    @CanIgnoreReturnValue
    public FieldMaskTree mergeFromFieldMask(FieldMask fieldMask) {
        Iterator<String> it = fieldMask.getPathsList().iterator();
        while (it.hasNext()) {
            addFieldPath(it.next());
        }
        return this;
    }

    @CanIgnoreReturnValue
    public FieldMaskTree removeFromFieldMask(FieldMask fieldMask) {
        Iterator<String> it = fieldMask.getPathsList().iterator();
        while (it.hasNext()) {
            removeFieldPath(it.next());
        }
        return this;
    }

    public FieldMask toFieldMask() {
        if (this.root.children.isEmpty()) {
            return FieldMask.getDefaultInstance();
        }
        ArrayList arrayList = new ArrayList();
        getFieldPaths(this.root, "", arrayList);
        return FieldMask.newBuilder().addAllPaths(arrayList).build();
    }

    public String toString() {
        return FieldMaskUtil.toString(toFieldMask());
    }

    public FieldMaskTree() {
    }

    @CanIgnoreReturnValue
    public FieldMaskTree removeFieldPath(String str) {
        List<String> listSplitToList = Splitter.onPattern(FIELD_PATH_SEPARATOR_REGEX).splitToList(str);
        if (listSplitToList.isEmpty()) {
            return this;
        }
        removeFieldPath(this.root, listSplitToList, 0);
        return this;
    }

    public void merge(Message message, Message.Builder builder, FieldMaskUtil.MergeOptions mergeOptions) {
        if (message.getDescriptorForType() == builder.getDescriptorForType()) {
            if (this.root.children.isEmpty()) {
                return;
            }
            merge(this.root, message, builder, mergeOptions);
            return;
        }
        h.s("Cannot merge messages of different types.");
    }
}
