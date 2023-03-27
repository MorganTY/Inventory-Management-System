package com.morgan.inventorymanagement;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class InventoryManagementFileWriterReader {

/*    itemsList = readItemsFromFile();
        transactionsList = readTransactionsFromFile();
}
   int userInput = input.nextInt(); //defining value from userInput
        input.nextLine();
        switch (userInput) {
            case 1:
                Transaction transaction = addItem(itemsList);
                addTransaction(transaction, transactionsList);
//                writeToFiles(itemsList, transactionsList);
                writeToDb(itemsList, transactionsList);
                break;
            case 2:

                transaction = editQuantity(itemsList);
                addTransaction(transaction, transactionsList);
//                writeToFiles(itemsList, transactionsList);
                writeToDb(itemsList, transactionsList);
                break;
            case 3:
                transaction = removeItem(itemsList);
                addTransaction(transaction, transactionsList);
//                writeToFiles(itemsList, transactionsList);
                writeToDb(itemsList, transactionsList);
                break;
            case 4:
                viewTransactionReport(transactionsList);
                break;
            case 5:
                System.out.println("See ya chump");
                input.close();
                exit(0);
                break;
            default:
                System.err.println("This doesn't appear to be a valid option please try again!"); //s
                break;
        }

        private  void writeToFiles(ArrayList<Item> itemsList, ArrayList<Transaction> transactionsList) throws IOException {
        String itemFile = "src/main/resources/items.txt";
        String transactionFile = "src/main/resources/transactions.txt";
        FileWriter itemWriter = new FileWriter(itemFile, false);
        itemWriter.write("id,description,unitPrice,qtyStock,totalPrice,\n");
        itemsList.forEach(item -> {
            try {
                itemWriter.write(padId(item.getId().toString()) + "," + item.getDescription() + "," + item.getUnitPrice() + "," + item.getQtyStock() + "," + item.getTotalPrice() + ",\n");
            } catch (IOException e) {
                e.printStackTrace(); //logs line for error
                exit(1);
            }
        });
        itemWriter.close();

        FileWriter transactionsWriter = new FileWriter(transactionFile, false);
        transactionsWriter.write("id,description,qtySold,Amount(£),remainingStock,transactionType,day,\n");
        transactionsList.forEach(transaction -> {
            try {
                transactionsWriter.write(padId(transaction.getId().toString()) + "," + transaction.getDescription() + "," + transaction.getQtySold() + "," + transaction.getAmount() + "," + transaction.getRemainingStock() + "," + transaction.getTransactionType() + "," + transaction.getTimestamp() + ",\n");
            } catch (IOException e) {
                e.printStackTrace(); //logs line for error
                exit(1);
            }
        });
        transactionsWriter.close();
private  Item readStringToItemObject(String itemFile) {
        String[] itemComponents = StringUtils.commaDelimitedListToStringArray(itemFile);
        Item item = new Item(
                Integer.parseInt(itemComponents[0]),
                itemComponents[1],
                Double.parseDouble(itemComponents[2]),
                Integer.valueOf(itemComponents[3]),
                Double.parseDouble(itemComponents[4]));
        return item;
    }


    /*private  ArrayList<Item> readItemsFromFile() { //Not needed unless wanting to read from a file
        File file = new File("src/main/resources/items.txt");
        List<String> lines = new ArrayList<>();
        try {
             lines = FileUtils.readLines(file, Charset.forName("UTF-8"));
        } catch (IOException e) {
            System.out.println("Error accessing items.txt: " + e.getMessage());
        }

        if (lines.size() != 0) {
			lines.remove(0);
		}
        ArrayList<Item> items = new ArrayList<>();
		lines.forEach(line -> {
			Item item = readStringToItemObject(line);

			items.add(item);
		});
        return items;
		String[] itemsFileLines = new String[0];
		try {
            String fileContents = FileUtils.readFileToString(new File("src/main/resources/items.txt"), StandardCharsets.UTF_8);
			System.out.println(fileContents);
            itemsFileLines = StringUtils.split(fileContents, ",\n");
            for (String s: itemsFileLines
                 ) {
                System.out.println(s);
            }

        } catch (IOException e) {
			System.err.println("Items.txt not found.");
			exit(1);
		}
		ArrayList<String> itemFiles = new ArrayList<>(Arrays.asList(itemsFileLines));
        log.info("Item files: {}", itemFiles);

        for (String s: itemFiles
             ) {
            System.out.println(s);
        }
        System.out.println(itemFiles.size());


        String[] items = new String[99999];
        int itemCounter = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/items.txt"));
            String itemString;
            while((itemString = bufferedReader.readLine()) != null) {
                System.out.println("count: " + itemCounter + 1 + " " + itemString);
                items[itemCounter] = itemString;
                ++itemCounter;
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (String item : items
        ) {
            Item itemToAdd = readStringToItemObject(item);
            itemsList.add(itemToAdd);
        return items;
       }
       private  ArrayList<Transaction> readTransactionsFromFile() {
        File file = new File("src/main/resources/transactions.txt");
        List<String> lines = new ArrayList<>();
        try {
            lines = FileUtils.readLines(file, StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("Error accessing items.txt: " + e.getMessage());
        }
        if (lines.size() != 0) {
            lines.remove(0);
        }
//        for (String line: lines
//             ) {
//            System.out.println(line);
//        }
//        System.out.println("Lines: " + lines.size());
        ArrayList<Transaction> transactions = new ArrayList<>();
        lines.forEach(itemFile -> {
            Transaction transaction = readStringToTransactionObject(itemFile);
            transactions.add(transaction);
        });
//        transactions.forEach(transaction -> System.out.println(transaction));
        return transactions;
 */
}

