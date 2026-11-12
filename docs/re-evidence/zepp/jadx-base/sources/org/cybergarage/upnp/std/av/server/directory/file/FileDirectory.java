package org.cybergarage.upnp.std.av.server.directory.file;

import java.io.File;
import org.cybergarage.upnp.std.av.server.Directory;
import org.cybergarage.upnp.std.av.server.object.ContentNode;
import org.cybergarage.upnp.std.av.server.object.Format;
import org.cybergarage.upnp.std.av.server.object.FormatObject;
import org.cybergarage.upnp.std.av.server.object.item.file.FileItemNode;
import org.cybergarage.upnp.std.av.server.object.item.file.FileItemNodeList;
import org.cybergarage.util.Debug;

/* JADX INFO: loaded from: classes23.dex */
public class FileDirectory extends Directory {
    private String path;

    public FileDirectory(String str, String str2) {
        super(str);
        setPath(str2);
    }

    private void addItemNode(FileItemNode fileItemNode) {
        addContentNode(fileItemNode);
    }

    private FileItemNode createCompareItemNode(File file) {
        if (getContentDirectory().getFormat(file) == null) {
            return null;
        }
        FileItemNode fileItemNode = new FileItemNode();
        fileItemNode.setFile(file);
        return fileItemNode;
    }

    private FileItemNodeList getCurrentDirectoryItemNodeList() {
        FileItemNodeList fileItemNodeList = new FileItemNodeList();
        getDirectoryItemNodeList(new File(getPath()), fileItemNodeList);
        return fileItemNodeList;
    }

    private int getDirectoryItemNodeList(File file, FileItemNodeList fileItemNodeList) {
        FileItemNode fileItemNodeCreateCompareItemNode;
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                getDirectoryItemNodeList(file2, fileItemNodeList);
            } else if (file2.isFile() && (fileItemNodeCreateCompareItemNode = createCompareItemNode(file2)) != null) {
                fileItemNodeList.add(fileItemNodeCreateCompareItemNode);
            }
        }
        return fileItemNodeList.size();
    }

    private FileItemNode getItemNode(File file) {
        int nContentNodes = getNContentNodes();
        for (int i = 0; i < nContentNodes; i++) {
            ContentNode contentNode = getContentNode(i);
            if (contentNode instanceof FileItemNode) {
                FileItemNode fileItemNode = (FileItemNode) contentNode;
                if (fileItemNode.equals(file)) {
                    return fileItemNode;
                }
            }
        }
        return null;
    }

    private boolean updateItemNode(FileItemNode fileItemNode, File file) {
        Format format = getContentDirectory().getFormat(file);
        if (format == null) {
            return false;
        }
        FormatObject formatObjectCreateObject = format.createObject(file);
        fileItemNode.setFile(file);
        String title = formatObjectCreateObject.getTitle();
        if (title.length() > 0) {
            fileItemNode.setTitle(title);
        }
        String creator = formatObjectCreateObject.getCreator();
        if (creator.length() > 0) {
            fileItemNode.setCreator(creator);
        }
        String mediaClass = format.getMediaClass();
        if (mediaClass.length() > 0) {
            fileItemNode.setUPnPClass(mediaClass);
        }
        fileItemNode.setDate(file.lastModified());
        try {
            fileItemNode.setStorageUsed(file.length());
        } catch (Exception e) {
            Debug.warning(e);
        }
        fileItemNode.setResource(getContentDirectory().getContentExportURL(fileItemNode.getID()), "http-get:*:" + format.getMimeType() + ":*", formatObjectCreateObject.getAttributeList());
        getContentDirectory().updateSystemUpdateID();
        return true;
    }

    private boolean updateItemNodeList(FileItemNode fileItemNode) {
        File file = fileItemNode.getFile();
        FileItemNode itemNode = getItemNode(file);
        if (itemNode == null) {
            fileItemNode.setID(getContentDirectory().getNextItemID());
            updateItemNode(fileItemNode, file);
            addItemNode(fileItemNode);
            return true;
        }
        if (itemNode.getFileTimeStamp() == fileItemNode.getFileTimeStamp()) {
            return false;
        }
        updateItemNode(itemNode, file);
        return true;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String str) {
        this.path = str;
    }

    @Override // org.cybergarage.upnp.std.av.server.Directory
    public boolean update() {
        return updateItemNodeList();
    }

    private boolean updateItemNodeList() {
        File file;
        int nContentNodes = getNContentNodes();
        ContentNode[] contentNodeArr = new ContentNode[nContentNodes];
        for (int i = 0; i < nContentNodes; i++) {
            contentNodeArr[i] = getContentNode(i);
        }
        boolean z = false;
        for (int i2 = 0; i2 < nContentNodes; i2++) {
            if ((contentNodeArr[i2] instanceof FileItemNode) && (file = ((FileItemNode) contentNodeArr[i2]).getFile()) != null && !file.exists()) {
                removeContentNode(contentNodeArr[i2]);
                z = true;
            }
        }
        FileItemNodeList currentDirectoryItemNodeList = getCurrentDirectoryItemNodeList();
        int size = currentDirectoryItemNodeList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (updateItemNodeList(currentDirectoryItemNodeList.getFileItemNode(i3))) {
                z = true;
            }
        }
        return z;
    }
}
